import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainGUI
extends JFrame
implements ActionListener {
    private static final long serialVersionUID = 1L;
    private JTextField bankroll;
    private JTextField teamBCsgo;
    private JTextField teamACsgo;
    private JTextField teamAOdd;
    private JTextField teamBOdd;
    private JButton btnCalculate;
    private JLabel lblResults;
    private Kelly kelly = new Kelly();

    public MainGUI() {
        this.setTitle("The Kelly Criterion");
        this.setDefaultCloseOperation(3);
        this.setBounds(100, 100, 400, 300);
        this.setLocationRelativeTo(null);
        GridBagLayout gridBagLayout = new GridBagLayout();
        gridBagLayout.columnWidths = new int[2];
        gridBagLayout.rowHeights = new int[12];
        gridBagLayout.columnWeights = new double[]{1.0, 1.0};
        gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
        this.getContentPane().setLayout(gridBagLayout);
        JLabel lblBankroll = new JLabel("Your Bankroll");
        GridBagConstraints gbc_lblBankroll = new GridBagConstraints();
        gbc_lblBankroll.anchor = 17;
        gbc_lblBankroll.insets = new Insets(5, 5, 5, 5);
        gbc_lblBankroll.gridx = 0;
        gbc_lblBankroll.gridy = 0;
        this.getContentPane().add((Component)lblBankroll, gbc_lblBankroll);
        this.bankroll = new JTextField();
        GridBagConstraints gbc_bankroll = new GridBagConstraints();
        gbc_bankroll.insets = new Insets(5, 5, 5, 5);
        gbc_bankroll.fill = 2;
        gbc_bankroll.gridx = 0;
        gbc_bankroll.gridy = 1;
        this.getContentPane().add((Component)this.bankroll, gbc_bankroll);
        this.bankroll.setColumns(10);
        JLabel lblcsglOdds = new JLabel("CSGOLounge Odds");
        GridBagConstraints gbc_lblcsglOdds = new GridBagConstraints();
        gbc_lblcsglOdds.gridwidth = 2;
        gbc_lblcsglOdds.insets = new Insets(5, 5, 5, 5);
        gbc_lblcsglOdds.gridx = 0;
        gbc_lblcsglOdds.gridy = 2;
        this.getContentPane().add((Component)lblcsglOdds, gbc_lblcsglOdds);
        JLabel lblTeamACsgo = new JLabel("Team A");
        GridBagConstraints gbc_lblTeamACsgo = new GridBagConstraints();
        gbc_lblTeamACsgo.insets = new Insets(5, 5, 5, 5);
        gbc_lblTeamACsgo.gridx = 0;
        gbc_lblTeamACsgo.gridy = 3;
        this.getContentPane().add((Component)lblTeamACsgo, gbc_lblTeamACsgo);
        JLabel lblTeamBCsgo = new JLabel("Team B");
        GridBagConstraints gbc_lblTeamBCsgo = new GridBagConstraints();
        gbc_lblTeamBCsgo.insets = new Insets(5, 5, 5, 5);
        gbc_lblTeamBCsgo.gridx = 1;
        gbc_lblTeamBCsgo.gridy = 3;
        this.getContentPane().add((Component)lblTeamBCsgo, gbc_lblTeamBCsgo);
        this.teamACsgo = new JTextField();
        GridBagConstraints gbc_teamACsgo = new GridBagConstraints();
        gbc_teamACsgo.insets = new Insets(5, 5, 5, 5);
        gbc_teamACsgo.fill = 2;
        gbc_teamACsgo.gridx = 0;
        gbc_teamACsgo.gridy = 4;
        this.getContentPane().add((Component)this.teamACsgo, gbc_teamACsgo);
        this.teamACsgo.setColumns(10);
        this.teamBCsgo = new JTextField();
        GridBagConstraints gbc_teamBCsgo = new GridBagConstraints();
        gbc_teamBCsgo.insets = new Insets(5, 5, 5, 5);
        gbc_teamBCsgo.fill = 2;
        gbc_teamBCsgo.gridx = 1;
        gbc_teamBCsgo.gridy = 4;
        this.getContentPane().add((Component)this.teamBCsgo, gbc_teamBCsgo);
        this.teamBCsgo.setColumns(10);
        JLabel yourOdds = new JLabel("Yours odds");
        GridBagConstraints gbc_yourOdds = new GridBagConstraints();
        gbc_yourOdds.gridwidth = 2;
        gbc_yourOdds.insets = new Insets(5, 5, 5, 5);
        gbc_yourOdds.gridx = 0;
        gbc_yourOdds.gridy = 5;
        this.getContentPane().add((Component)yourOdds, gbc_yourOdds);
        JLabel teamA = new JLabel("Team A");
        GridBagConstraints gbc_teamA = new GridBagConstraints();
        gbc_teamA.insets = new Insets(5, 5, 5, 5);
        gbc_teamA.gridx = 0;
        gbc_teamA.gridy = 6;
        this.getContentPane().add((Component)teamA, gbc_teamA);
        JLabel teamB = new JLabel("Team B");
        GridBagConstraints gbc_teamB = new GridBagConstraints();
        gbc_teamB.insets = new Insets(5, 5, 5, 5);
        gbc_teamB.gridx = 1;
        gbc_teamB.gridy = 6;
        this.getContentPane().add((Component)teamB, gbc_teamB);
        this.teamAOdd = new JTextField();
        GridBagConstraints gbc_teamAOdd = new GridBagConstraints();
        gbc_teamAOdd.insets = new Insets(5, 5, 5, 5);
        gbc_teamAOdd.fill = 2;
        gbc_teamAOdd.gridx = 0;
        gbc_teamAOdd.gridy = 7;
        this.getContentPane().add((Component)this.teamAOdd, gbc_teamAOdd);
        this.teamAOdd.setColumns(10);
        this.teamBOdd = new JTextField();
        GridBagConstraints gbc_teamBOdd = new GridBagConstraints();
        gbc_teamBOdd.insets = new Insets(5, 5, 5, 5);
        gbc_teamBOdd.fill = 2;
        gbc_teamBOdd.gridx = 1;
        gbc_teamBOdd.gridy = 7;
        this.getContentPane().add((Component)this.teamBOdd, gbc_teamBOdd);
        this.teamBOdd.setColumns(10);
        this.btnCalculate = new JButton("Calculate");
        GridBagConstraints gbc_btnCalculate = new GridBagConstraints();
        gbc_btnCalculate.gridwidth = 2;
        gbc_btnCalculate.insets = new Insets(5, 5, 5, 5);
        gbc_btnCalculate.gridx = 0;
        gbc_btnCalculate.gridy = 8;
        this.getContentPane().add((Component)this.btnCalculate, gbc_btnCalculate);
        this.btnCalculate.addActionListener(this);
        this.lblResults = new JLabel();
        GridBagConstraints gbc_lblResults = new GridBagConstraints();
        gbc_lblResults.gridwidth = 3;
        gbc_lblResults.gridx = 0;
        gbc_lblResults.gridy = 10;
        this.getContentPane().add((Component)this.lblResults, gbc_lblResults);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        if (event.getSource().equals(this.btnCalculate)) {
            this.kelly.calculate(this.bankroll.getText(), this.teamACsgo.getText(), this.teamBCsgo.getText(), this.teamAOdd.getText(), this.teamBOdd.getText());
            this.lblResults.setText("You should bet " + String.valueOf(this.kelly.getFraction()));
        }
    }
}
