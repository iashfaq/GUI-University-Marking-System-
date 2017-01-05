package application;

import javafx.event.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MainController {

	// flagged the FXML elements in the GUI I have made so the methods in this
	// Java project can refer to them.
	// this is for the elements in the Level 4 section of GUI.
	@FXML
	public TextField lvl4Mod1Ict1;
	@FXML
	public TextField lvl4Mod1Ict2;
	@FXML
	public TextField lvl4Mod1Ict3;

	@FXML
	public TextField lvl4Mod2Ict1;
	@FXML
	public TextField lvl4Mod2Ict2;
	@FXML
	public TextField lvl4Mod2Ict3;

	@FXML
	public TextField lvl4Mod3Ict1;
	@FXML
	public TextField lvl4Mod3Ict2;
	@FXML
	public TextField lvl4Mod3Ict3;

	@FXML
	public TextField lvl4Mod4Ict1;
	@FXML
	public TextField lvl4Mod4Ict2;
	@FXML
	public TextField lvl4Mod4Ict3;

	@FXML
	public TextField lvl4Mod5Ict1;
	@FXML
	public TextField lvl4Mod5Ict2;
	@FXML
	public TextField lvl4Mod5Ict3;

	@FXML
	public TextField lvl4Mod6Ict1;
	@FXML
	public TextField lvl4Mod6Ict2;
	@FXML
	public TextField lvl4Mod6Ict3;

	@FXML
	public Label lvl4Mod1Stat;
	@FXML
	public Label lvl4Mod2Stat;
	@FXML
	public Label lvl4Mod3Stat;
	@FXML
	public Label lvl4Mod4Stat;
	@FXML
	public Label lvl4Mod5Stat;
	@FXML
	public Label lvl4Mod6Stat;

	@FXML
	public Label lblLvl4TotCred;

	@FXML
	public Label lvl4Mod1Retake;
	@FXML
	public Label lvl4Mod2Retake;
	@FXML
	public Label lvl4Mod3Retake;
	@FXML
	public Label lvl4Mod4Retake;
	@FXML
	public Label lvl4Mod5Retake;
	@FXML
	public Label lvl4Mod6Retake;

	@FXML
	public Button lvl4Ent;

	// this is for the elements in the Level 5 section of GUI.
	@FXML
	public TextField lvl5Mod1Ict1;
	@FXML
	public TextField lvl5Mod1Ict2;
	@FXML
	public TextField lvl5Mod1Ict3;

	@FXML
	public TextField lvl5Mod2Ict1;
	@FXML
	public TextField lvl5Mod2Ict2;
	@FXML
	public TextField lvl5Mod2Ict3;

	@FXML
	public TextField lvl5Mod3Ict1;
	@FXML
	public TextField lvl5Mod3Ict2;
	@FXML
	public TextField lvl5Mod3Ict3;

	@FXML
	private TextField lvl5Mod4Ict1;
	@FXML
	private TextField lvl5Mod4Ict2;
	@FXML
	private TextField lvl5Mod4Ict3;

	@FXML
	private TextField lvl5Mod5Ict1;
	@FXML
	private TextField lvl5Mod5Ict2;
	@FXML
	private TextField lvl5Mod5Ict3;

	@FXML
	private TextField lvl5Mod6Ict1;
	@FXML
	private TextField lvl5Mod6Ict2;
	@FXML
	private TextField lvl5Mod6Ict3;

	@FXML
	private Label lvl5Mod1Stat;
	@FXML
	public Label lvl5Mod2Stat;
	@FXML
	private Label lvl5Mod3Stat;
	@FXML
	public Label lvl5Mod4Stat;
	@FXML
	public Label lvl5Mod5Stat;
	@FXML
	public Label lvl5Mod6Stat;

	@FXML
	public Label lblLvl5TotCred;

	@FXML
	public Label lvl5Mod1Retake;
	@FXML
	public Label lvl5Mod2Retake;
	@FXML
	public Label lvl5Mod3Retake;
	@FXML
	public Label lvl5Mod4Retake;
	@FXML
	public Label lvl5Mod5Retake;
	@FXML
	public Label lvl5Mod6Retake;

	@FXML
	public Button lvl5Ent;

	// this is for the elements in the Level 6 section of GUI.
	@FXML
	public TextField lvl6Mod1Ict1;
	@FXML
	public TextField lvl6Mod1Ict2;
	@FXML
	public TextField lvl6Mod1Ict3;

	@FXML
	public TextField lvl6Mod2Ict1;
	@FXML
	public TextField lvl6Mod2Ict2;
	@FXML
	public TextField lvl6Mod2Ict3;

	@FXML
	public TextField lvl6Mod3Ict1;
	@FXML
	public TextField lvl6Mod3Ict2;
	@FXML
	public TextField lvl6Mod3Ict3;

	@FXML
	public TextField lvl6Mod4Ict1;
	@FXML
	public TextField lvl6Mod4Ict2;
	@FXML
	public TextField lvl6Mod4Ict3;

	@FXML
	public TextField lvl6Mod5Ict1;
	@FXML
	public TextField lvl6Mod5Ict2;
	@FXML
	public TextField lvl6Mod5Ict3;

	@FXML
	public TextField lvl6Mod6Ict1;
	@FXML
	public TextField lvl6Mod6Ict2;
	@FXML
	public TextField lvl6Mod6Ict3;

	@FXML
	public Label lvl6Mod1Stat;
	@FXML
	public Label lvl6Mod2Stat;
	@FXML
	public Label lvl6Mod3Stat;
	@FXML
	public Label lvl6Mod4Stat;
	@FXML
	public Label lvl6Mod5Stat;
	@FXML
	public Label lvl6Mod6Stat;

	@FXML
	public Label lblLvl6TotCred;

	@FXML
	public Label lvl6Mod1Retake;
	@FXML
	public Label lvl6Mod2Retake;
	@FXML
	public Label lvl6Mod3Retake;
	@FXML
	public Label lvl6Mod4Retake;
	@FXML
	public Label lvl6Mod5Retake;
	@FXML
	public Label lvl6Mod6Retake;

	@FXML
	public Button lvl6Ent;

	// declaration of FXML elements for the condoned credits section
	@FXML
	public CheckBox cbMod1;
	@FXML
	public CheckBox cbMod2;
	@FXML
	public CheckBox cbMod3;
	@FXML
	public CheckBox cbMod4;
	@FXML
	public CheckBox cbMod5;
	@FXML
	public CheckBox cbMod6;
	@FXML
	public Button CondoneEnter;
	@FXML
	public Label condoneStat;

	// this is for the screen elements
	@FXML
	public Label lblStatus;

	@FXML
	public TextField txtUserName;

	@FXML
	public TextField txtPassword;

	// this is for the components in the final
	@FXML
	public Label qualStat;
	@FXML
	public Label classStat;

	// below are the variables declared to calculate the total credits of Level
	// 4
	public int lvl4TotCred; // total credits obtained in level 4
	public int lvl4Mod1Cred; // credits obtained in level 4 module 1
	public int lvl4Mod2Cred; // credits obtained in level 4 module 2
	public int lvl4Mod3Cred; // credits obtained in level 4 module 3
	public int lvl4Mod4Cred; // credits obtained in level 4 module 4
	public int lvl4Mod5Cred; // credits obtained in level 4 module 5
	public int lvl4Mod6Cred; // credits obtained in level 4 module 6

	public int intLvl4Mod1Ict1;
	public int intLvl4Mod1Ict2;
	public int intLvl4Mod1Ict3;

	public int intLvl4Mod2Ict1;
	public int intLvl4Mod2Ict2;
	public int intLvl4Mod2Ict3;

	public int intLvl4Mod3Ict1;
	public int intLvl4Mod3Ict2;
	public int intLvl4Mod3Ict3;

	public int intLvl4Mod4Ict1;
	public int intLvl4Mod4Ict2;
	public int intLvl4Mod4Ict3;

	public int intLvl4Mod5Ict1;
	public int intLvl4Mod5Ict2;
	public int intLvl4Mod5Ict3;

	public int intLvl4Mod6Ict1;
	public int intLvl4Mod6Ict2;
	public int intLvl4Mod6Ict3;

	// method that handles the user login inputs and conditions
	public void Login(ActionEvent event) throws Exception {
		// condition to check if the username and password are correct
		if (txtUserName.getText().equals("Gugsi") && txtPassword.getText().equals("pass")) {
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
			lblStatus.setText("");
		} else {
			lblStatus.setText("Username or Password incorrect");
		}
	}

	// this method is written to manipulate the 'Enter' button in the Level 04
	// section
	public void Enter(ActionEvent a) throws Exception {

		try {

			// declaring variables to capture integer values entered into the
			// text-fields of Level4
			int intLvl4Mod1Ict1 = Integer.parseInt(lvl4Mod1Ict1.getText());
			int intLvl4Mod1Ict2 = Integer.parseInt(lvl4Mod1Ict2.getText());
			int intLvl4Mod1Ict3 = Integer.parseInt(lvl4Mod1Ict3.getText());

			int intLvl4Mod2Ict1 = Integer.parseInt(lvl4Mod2Ict1.getText());
			int intLvl4Mod2Ict2 = Integer.parseInt(lvl4Mod2Ict2.getText());
			int intLvl4Mod2Ict3 = Integer.parseInt(lvl4Mod2Ict3.getText());

			int intLvl4Mod3Ict1 = Integer.parseInt(lvl4Mod3Ict1.getText());
			int intLvl4Mod3Ict2 = Integer.parseInt(lvl4Mod3Ict2.getText());
			int intLvl4Mod3Ict3 = Integer.parseInt(lvl4Mod3Ict3.getText());

			int intLvl4Mod4Ict1 = Integer.parseInt(lvl4Mod4Ict1.getText());
			int intLvl4Mod4Ict2 = Integer.parseInt(lvl4Mod4Ict2.getText());
			int intLvl4Mod4Ict3 = Integer.parseInt(lvl4Mod4Ict3.getText());

			int intLvl4Mod5Ict1 = Integer.parseInt(lvl4Mod5Ict1.getText());
			int intLvl4Mod5Ict2 = Integer.parseInt(lvl4Mod5Ict2.getText());
			int intLvl4Mod5Ict3 = Integer.parseInt(lvl4Mod5Ict3.getText());

			int intLvl4Mod6Ict1 = Integer.parseInt(lvl4Mod6Ict1.getText());
			int intLvl4Mod6Ict2 = Integer.parseInt(lvl4Mod6Ict2.getText());
			int intLvl4Mod6Ict3 = Integer.parseInt(lvl4Mod6Ict3.getText());

			// conditions to check the marks of modules
			if (intLvl4Mod1Ict1 >= 40 && intLvl4Mod1Ict2 >= 40 && intLvl4Mod1Ict3 >= 40 && intLvl4Mod1Ict1 <= 100
					&& intLvl4Mod1Ict2 <= 100 && intLvl4Mod1Ict3 <= 100 && intLvl4Mod1Ict1 >= 0 && intLvl4Mod1Ict2 >= 0
					&& intLvl4Mod1Ict3 >= 0) {
				lvl4Mod1Stat.setText("20");
				lvl4Mod1Cred = 20;
			} else {
				lvl4Mod1Stat.setText("0");
				lvl4Mod1Cred = 0;
			}

			if ((intLvl4Mod1Ict1 < 30 || intLvl4Mod1Ict2 < 30 || intLvl4Mod1Ict3 < 30) && intLvl4Mod1Ict1 <= 100
					&& intLvl4Mod1Ict2 <= 100 && intLvl4Mod1Ict3 <= 100 && intLvl4Mod1Ict1 >= 0 && intLvl4Mod1Ict2 >= 0
					&& intLvl4Mod1Ict3 >= 0) {
				lvl4Mod1Retake.setText("!");
			} else {
				lvl4Mod1Retake.setText("");
			}

			if (intLvl4Mod2Ict1 >= 40 && intLvl4Mod2Ict2 >= 40 && intLvl4Mod2Ict3 >= 40 && intLvl4Mod2Ict1 <= 100
					&& intLvl4Mod2Ict2 <= 100 && intLvl4Mod2Ict3 <= 100 && intLvl4Mod2Ict1 >= 0 && intLvl4Mod2Ict2 >= 0
					&& intLvl4Mod2Ict3 >= 0) {
				lvl4Mod2Stat.setText("20");
				lvl4Mod2Cred = 20;
			} else {
				lvl4Mod2Stat.setText("0");
				lvl4Mod2Cred = 0;
			}

			if ((intLvl4Mod2Ict1 < 30 || intLvl4Mod2Ict2 < 30 || intLvl4Mod2Ict3 < 30) && intLvl4Mod2Ict1 <= 100
					&& intLvl4Mod2Ict2 <= 100 && intLvl4Mod2Ict3 <= 100 && intLvl4Mod2Ict1 >= 0 && intLvl4Mod2Ict2 >= 0
					&& intLvl4Mod2Ict3 >= 0) {
				lvl4Mod2Retake.setText("!");
			} else {
				lvl4Mod2Retake.setText("");
			}

			if (intLvl4Mod3Ict1 >= 40 && intLvl4Mod3Ict2 >= 40 && intLvl4Mod3Ict3 >= 40 && intLvl4Mod3Ict1 <= 100
					&& intLvl4Mod3Ict2 <= 100 && intLvl4Mod3Ict3 <= 100 && intLvl4Mod3Ict1 >= 0 && intLvl4Mod3Ict2 >= 0
					&& intLvl4Mod3Ict3 >= 0) {
				lvl4Mod3Stat.setText("20");
				lvl4Mod3Cred = 20;
			} else {
				lvl4Mod3Stat.setText("0");
				lvl4Mod3Cred = 0;
			}

			if ((intLvl4Mod3Ict1 < 30 || intLvl4Mod3Ict2 < 30 || intLvl4Mod3Ict3 < 30) && intLvl4Mod3Ict1 <= 100
					&& intLvl4Mod3Ict2 <= 100 && intLvl4Mod3Ict3 <= 100 && intLvl4Mod3Ict1 >= 0 && intLvl4Mod3Ict2 >= 0
					&& intLvl4Mod3Ict3 >= 0) {
				lvl4Mod3Retake.setText("!");
			} else {
				lvl4Mod3Retake.setText("");
			}

			if (intLvl4Mod4Ict1 >= 40 && intLvl4Mod4Ict2 >= 40 && intLvl4Mod4Ict3 >= 40 && intLvl4Mod4Ict1 <= 100
					&& intLvl4Mod4Ict2 <= 100 && intLvl4Mod4Ict3 <= 100 && intLvl4Mod4Ict1 >= 0 && intLvl4Mod4Ict2 >= 0
					&& intLvl4Mod4Ict3 >= 0) {
				lvl4Mod4Stat.setText("20");
				lvl4Mod4Cred = 20;
			} else {
				lvl4Mod4Stat.setText("0");
				lvl4Mod4Cred = 0;
			}

			if ((intLvl4Mod4Ict1 < 30 || intLvl4Mod4Ict2 < 30 || intLvl4Mod4Ict3 < 30) && intLvl4Mod4Ict1 <= 100
					&& intLvl4Mod4Ict2 <= 100 && intLvl4Mod4Ict3 <= 100 && intLvl4Mod4Ict1 >= 0 && intLvl4Mod4Ict2 >= 0
					&& intLvl4Mod4Ict3 >= 0) {
				lvl4Mod4Retake.setText("!");
			} else {
				lvl4Mod4Retake.setText("");
			}

			if (intLvl4Mod5Ict1 >= 40 && intLvl4Mod5Ict2 >= 40 && intLvl4Mod5Ict3 >= 40 && intLvl4Mod5Ict1 <= 100
					&& intLvl4Mod5Ict2 <= 100 && intLvl4Mod5Ict3 <= 100 && intLvl4Mod5Ict1 >= 0 && intLvl4Mod5Ict2 >= 0
					&& intLvl4Mod5Ict3 >= 0) {
				lvl4Mod5Stat.setText("20");
				lvl4Mod5Cred = 20;
			} else {
				lvl4Mod5Stat.setText("0");
				lvl4Mod5Cred = 0;
			}

			if ((intLvl4Mod5Ict1 < 30 || intLvl4Mod5Ict2 < 30 || intLvl4Mod5Ict3 < 30) && intLvl4Mod5Ict1 <= 100
					&& intLvl4Mod5Ict2 <= 100 && intLvl4Mod5Ict3 <= 100 && intLvl4Mod5Ict1 >= 0 && intLvl4Mod5Ict2 >= 0
					&& intLvl4Mod5Ict3 >= 0) {
				lvl4Mod5Retake.setText("!");
			} else {
				lvl4Mod5Retake.setText("");
			}

			if (intLvl4Mod6Ict1 >= 40 && intLvl4Mod6Ict2 >= 40 && intLvl4Mod6Ict3 >= 40 && intLvl4Mod6Ict1 <= 100
					&& intLvl4Mod6Ict2 <= 100 && intLvl4Mod6Ict3 <= 100 && intLvl4Mod6Ict1 >= 0 && intLvl4Mod6Ict2 >= 0
					&& intLvl4Mod6Ict3 >= 0) {
				lvl4Mod6Stat.setText("20");
				lvl4Mod6Cred = 20;
			} else {
				lvl4Mod6Stat.setText("0");
				lvl4Mod6Cred = 0;
			}

			if ((intLvl4Mod6Ict1 < 30 || intLvl4Mod6Ict2 < 30 || intLvl4Mod6Ict3 < 30) && intLvl4Mod6Ict1 <= 100
					&& intLvl4Mod6Ict2 <= 100 && intLvl4Mod6Ict3 <= 100 && intLvl4Mod6Ict1 >= 0 && intLvl4Mod6Ict2 >= 0
					&& intLvl4Mod6Ict3 >= 0) {
				lvl4Mod6Retake.setText("!");
			} else {
				lvl4Mod6Retake.setText("");
			}

			if (count <= 2) {
				lvl4TotCred = lvl4Mod1Cred + lvl4Mod2Cred + lvl4Mod3Cred + lvl4Mod4Cred + lvl4Mod5Cred + lvl4Mod6Cred
						+ intCondoneMod1 + intCondoneMod2 + intCondoneMod3 + intCondoneMod4 + intCondoneMod5
						+ intCondoneMod6;
				lblLvl4TotCred.setText(String.valueOf(lvl4TotCred));
				condoneStat.setText("");
			} else {
				lblLvl4TotCred.setText("Null");
			}

			// these conditions are to check the if condoned credits can be
			// applied for each of the modules of level 4
			// condition to verify the condoned credits for module 1
			if ((intLvl4Mod1Ict1 + intLvl4Mod1Ict2 + intLvl4Mod1Ict3 < 90
					&& intLvl4Mod1Ict1 + intLvl4Mod1Ict2 + intLvl4Mod1Ict3 <= 300
					&& intLvl4Mod1Ict1 + intLvl4Mod1Ict2 + intLvl4Mod1Ict3 >= 0) || lvl4Mod1Cred == 20) {
				cbMod1.setDisable(true);
			} else {
				cbMod1.setDisable(false);
			}

			// condition to verify the condoned credits for module 2
			if ((intLvl4Mod2Ict1 + intLvl4Mod2Ict2 + intLvl4Mod2Ict3 < 90
					&& intLvl4Mod2Ict1 + intLvl4Mod2Ict2 + intLvl4Mod2Ict3 <= 300
					&& intLvl4Mod2Ict1 + intLvl4Mod2Ict2 + intLvl4Mod2Ict3 >= 0) || lvl4Mod2Cred == 20) {
				cbMod2.setDisable(true);
			} else {
				cbMod2.setDisable(false);
			}

			// condition to verify the condoned credits for module 3
			if ((intLvl4Mod3Ict1 + intLvl4Mod3Ict2 + intLvl4Mod3Ict3 < 90
					&& intLvl4Mod3Ict1 + intLvl4Mod3Ict2 + intLvl4Mod3Ict3 <= 300
					&& intLvl4Mod3Ict1 + intLvl4Mod3Ict2 + intLvl4Mod3Ict3 >= 0) || lvl4Mod3Cred == 20) {
				cbMod3.setDisable(true);
			} else {
				cbMod3.setDisable(false);
			}

			// condition to verify the condoned credits for module 4
			if ((intLvl4Mod4Ict1 + intLvl4Mod4Ict2 + intLvl4Mod4Ict3 < 90
					&& intLvl4Mod4Ict1 + intLvl4Mod4Ict2 + intLvl4Mod4Ict3 <= 300
					&& intLvl4Mod4Ict1 + intLvl4Mod4Ict2 + intLvl4Mod4Ict3 >= 0) || lvl4Mod4Cred == 20) {
				cbMod4.setDisable(true);
			} else {
				cbMod4.setDisable(false);
			}

			// condition to verify the condoned credits for module 5
			if ((intLvl4Mod5Ict1 + intLvl4Mod5Ict2 + intLvl4Mod5Ict3 < 90
					&& intLvl4Mod5Ict1 + intLvl4Mod5Ict2 + intLvl4Mod5Ict3 <= 300
					&& intLvl4Mod5Ict1 + intLvl4Mod5Ict2 + intLvl4Mod5Ict3 >= 0) || lvl4Mod5Cred == 20) {
				cbMod5.setDisable(true);
			} else {
				cbMod5.setDisable(false);
			}

			// condition to verify the condoned credits for module 6
			if ((intLvl4Mod6Ict1 + intLvl4Mod6Ict2 + intLvl4Mod6Ict3 < 90
					&& intLvl4Mod6Ict1 + intLvl4Mod6Ict2 + intLvl4Mod6Ict3 <= 300
					&& intLvl4Mod6Ict1 + intLvl4Mod6Ict2 + intLvl4Mod6Ict3 >= 0) || lvl4Mod6Cred == 20) {
				cbMod6.setDisable(true);
			} else {
				cbMod6.setDisable(false);
			}

			// this disables the enter button for condoned credits based on
			// whether 100 credits achieved in level 4 or not
			if (lvl4TotCred >= 100) {
				CondoneEnter.setDisable(true);
			} else {
				CondoneEnter.setDisable(false);
			}

			/**
			 * this condition checks if the student can pass to Level 5 if he
			 * has achieved 100 credits. If not satisfied button 'Enter' is
			 * disabled for level 5
			 */
			if (lvl4TotCred < 100) {
				lvl5Ent.setDisable(true);
				lvl6Ent.setDisable(true);
			} else {
				lvl5Ent.setDisable(false);
				lvl6Ent.setDisable(false);
			}

			// this condition checks whether the condone credits have been
			// included and avoids credits being added twice
			// it also ensures that marks are added correctly without constant
			// back tracking
			if (lvl4TotCred >= 100) {
				lvl4Ent.setDisable(true);
			} else {
				lvl4Ent.setDisable(false);
			}

			// catch block in the 'try-catch' code is written to display 'Null'
			// if an invalid entry in given
		} catch (Exception exp1) {
			lvl4Mod1Stat.setText("");
			lvl4Mod1Cred = 0;
			lvl4Mod1Retake.setText("");

			lvl4Mod2Stat.setText("");
			lvl4Mod2Cred = 0;
			lvl4Mod2Retake.setText("");

			lvl4Mod3Stat.setText("");
			lvl4Mod3Cred = 0;
			lvl4Mod3Retake.setText("");

			lvl4Mod4Stat.setText("");
			lvl4Mod4Cred = 0;
			lvl4Mod4Retake.setText("");

			lvl4Mod5Stat.setText("");
			lvl4Mod5Cred = 0;
			lvl4Mod5Retake.setText("");

			lvl4Mod6Stat.setText("");
			lvl4Mod6Cred = 0;
			lvl4Mod6Retake.setText("");

			lblLvl4TotCred.setText("Null");
			lvl4TotCred = 0;

			cbMod1.setDisable(true);
			cbMod2.setDisable(true);
			cbMod3.setDisable(true);
			cbMod4.setDisable(true);
			cbMod5.setDisable(true);
			cbMod6.setDisable(true);
			CondoneEnter.setDisable(true);

			intCondoneMod1 = 0;
			intCondoneMod2 = 0;
			intCondoneMod3 = 0;
			intCondoneMod4 = 0;
			intCondoneMod5 = 0;
			intCondoneMod6 = 0;
			count = 0;
			condoneStat.setText("");

			lvl4Ent.setDisable(true);

		}

	}

	// method for the clear button in level 4 to clear all values in text
	// fields,labels and variables
	public void Clear(ActionEvent b) {
		lvl4Mod1Ict1.clear();
		lvl4Mod1Ict2.clear();
		lvl4Mod1Ict3.clear();
		lvl4Mod1Stat.setText("");
		lvl4Mod1Cred = 0;
		lvl4Mod1Retake.setText("");

		lvl4Mod2Ict1.clear();
		lvl4Mod2Ict2.clear();
		lvl4Mod2Ict3.clear();
		lvl4Mod2Stat.setText("");
		lvl4Mod2Cred = 0;
		lvl4Mod2Retake.setText("");

		lvl4Mod3Ict1.clear();
		lvl4Mod3Ict2.clear();
		lvl4Mod3Ict3.clear();
		lvl4Mod3Stat.setText("");
		lvl4Mod3Cred = 0;
		lvl4Mod3Retake.setText("");

		lvl4Mod4Ict1.clear();
		lvl4Mod4Ict2.clear();
		lvl4Mod4Ict3.clear();
		lvl4Mod4Stat.setText("");
		lvl4Mod4Cred = 0;
		lvl4Mod4Retake.setText("");

		lvl4Mod5Ict1.clear();
		lvl4Mod5Ict2.clear();
		lvl4Mod5Ict3.clear();
		lvl4Mod5Stat.setText("");
		lvl4Mod5Cred = 0;
		lvl4Mod5Retake.setText("");

		lvl4Mod6Ict1.clear();
		lvl4Mod6Ict2.clear();
		lvl4Mod6Ict3.clear();
		lvl4Mod6Stat.setText("");
		lvl4Mod6Cred = 0;
		lvl4Mod6Retake.setText("");

		lblLvl4TotCred.setText("");
		lvl4TotCred = 0;

		cbMod1.setDisable(false);
		cbMod2.setDisable(false);
		cbMod3.setDisable(false);
		cbMod4.setDisable(false);
		cbMod5.setDisable(false);
		cbMod6.setDisable(false);

		intCondoneMod1 = 0;
		intCondoneMod2 = 0;
		intCondoneMod3 = 0;
		intCondoneMod4 = 0;
		intCondoneMod5 = 0;
		intCondoneMod6 = 0;
		count = 0;
		condoneStat.setText("");

		lvl4Ent.setDisable(false);
	}

	// below are the variables declared to calculate the total credits of Level
	// 5
	public int lvl5TotCred; // total credits obtained in level 5
	public int lvl5Mod1Cred; // credits obtained in level 5 module 1
	public int lvl5Mod2Cred; // credits obtained in level 5 module 2
	public int lvl5Mod3Cred; // credits obtained in level 5 module 3
	public int lvl5Mod4Cred; // credits obtained in level 5 module 4
	public int lvl5Mod5Cred; // credits obtained in level 5 module 4
	public int lvl5Mod6Cred; // credits obtained in level 5 module 5

	public int intLvl5Mod1Ict1;
	public int intLvl5Mod1Ict2;
	public int intLvl5Mod1Ict3;

	public int intLvl5Mod2Ict1;
	public int intLvl5Mod2Ict2;
	public int intLvl5Mod2Ict3;

	public int intLvl5Mod3Ict1;
	public int intLvl5Mod3Ict2;
	public int intLvl5Mod3Ict3;

	public int intLvl5Mod4Ict1;
	public int intLvl5Mod4Ict2;
	public int intLvl5Mod4Ict3;

	public int intLvl5Mod5Ict1;
	public int intLvl5Mod5Ict2;
	public int intLvl5Mod5Ict3;

	public int intLvl5Mod6Ict1;
	public int intLvl5Mod6Ict2;
	public int intLvl5Mod6Ict3;

	// this method is written to manipulate the 'Enter' button in the Level 05
	// section
	public void EnterLvl5(ActionEvent c) throws Exception {
		try {

			// declaring variables to capture integer values entered into the
			// text-fields
			int intLvl5Mod1Ict1 = Integer.parseInt(lvl5Mod1Ict1.getText());
			int intLvl5Mod1Ict2 = Integer.parseInt(lvl5Mod1Ict2.getText());
			int intLvl5Mod1Ict3 = Integer.parseInt(lvl5Mod1Ict3.getText());

			int intLvl5Mod2Ict1 = Integer.parseInt(lvl5Mod2Ict1.getText());
			int intLvl5Mod2Ict2 = Integer.parseInt(lvl5Mod2Ict2.getText());
			int intLvl5Mod2Ict3 = Integer.parseInt(lvl5Mod2Ict3.getText());

			int intLvl5Mod3Ict1 = Integer.parseInt(lvl5Mod3Ict1.getText());
			int intLvl5Mod3Ict2 = Integer.parseInt(lvl5Mod3Ict2.getText());
			int intLvl5Mod3Ict3 = Integer.parseInt(lvl5Mod3Ict3.getText());

			int intLvl5Mod4Ict1 = Integer.parseInt(lvl5Mod4Ict1.getText());
			int intLvl5Mod4Ict2 = Integer.parseInt(lvl5Mod4Ict2.getText());
			int intLvl5Mod4Ict3 = Integer.parseInt(lvl5Mod4Ict3.getText());

			int intLvl5Mod5Ict1 = Integer.parseInt(lvl5Mod5Ict1.getText());
			int intLvl5Mod5Ict2 = Integer.parseInt(lvl5Mod5Ict2.getText());
			int intLvl5Mod5Ict3 = Integer.parseInt(lvl5Mod5Ict3.getText());

			int intLvl5Mod6Ict1 = Integer.parseInt(lvl5Mod6Ict1.getText());
			int intLvl5Mod6Ict2 = Integer.parseInt(lvl5Mod6Ict2.getText());
			int intLvl5Mod6Ict3 = Integer.parseInt(lvl5Mod6Ict3.getText());

			// conditions to check if the marks full fill the credits in level 5
			// conditions for module 1
			if (intLvl5Mod1Ict1 >= 40 && intLvl5Mod1Ict2 >= 40 && intLvl5Mod1Ict3 >= 40 && intLvl5Mod1Ict1 <= 100
					&& intLvl5Mod1Ict2 <= 100 && intLvl5Mod1Ict3 <= 100 && intLvl5Mod1Ict1 >= 0 && intLvl5Mod1Ict2 >= 0
					&& intLvl5Mod1Ict3 >= 0) {
				lvl5Mod1Stat.setText("20");
				lvl5Mod1Cred = 20;
			} else {
				lvl5Mod1Stat.setText("0");
				lvl5Mod1Cred = 0;
			}

			if ((intLvl5Mod1Ict1 < 30 || intLvl5Mod1Ict2 < 30 || intLvl5Mod1Ict3 < 30) && intLvl5Mod1Ict1 <= 100
					&& intLvl5Mod1Ict2 <= 100 && intLvl5Mod1Ict3 <= 100 && intLvl5Mod1Ict1 >= 0 && intLvl5Mod1Ict2 >= 0
					&& intLvl5Mod1Ict3 >= 0) {
				lvl5Mod1Retake.setText("!");
			} else {
				lvl5Mod1Retake.setText("");
			}

			// conditions for module 2
			if (intLvl5Mod2Ict1 >= 40 && intLvl5Mod2Ict2 >= 40 && intLvl5Mod2Ict3 >= 40 && intLvl5Mod2Ict1 <= 100
					&& intLvl5Mod2Ict2 <= 100 && intLvl5Mod2Ict3 <= 100 && intLvl5Mod2Ict1 >= 0 && intLvl5Mod2Ict2 >= 0
					&& intLvl5Mod2Ict3 >= 0) {
				lvl5Mod2Stat.setText("20");
				lvl5Mod2Cred = 20;
			} else {
				lvl5Mod2Stat.setText("0");
				lvl5Mod2Cred = 0;
			}

			if ((intLvl5Mod2Ict1 < 30 || intLvl5Mod2Ict2 < 30 || intLvl5Mod2Ict3 < 30) && intLvl5Mod2Ict1 <= 100
					&& intLvl5Mod2Ict2 <= 100 && intLvl5Mod2Ict3 <= 100 && intLvl5Mod2Ict1 >= 0 && intLvl5Mod2Ict2 >= 0
					&& intLvl5Mod2Ict3 >= 0) {
				lvl5Mod2Retake.setText("!");
			} else {
				lvl5Mod2Retake.setText("");
			}

			// conditions for module 3
			if (intLvl5Mod3Ict1 >= 40 && intLvl5Mod3Ict2 >= 40 && intLvl5Mod3Ict3 >= 40 && intLvl5Mod3Ict1 <= 100
					&& intLvl5Mod3Ict2 <= 100 && intLvl5Mod3Ict3 <= 100 && intLvl5Mod3Ict1 >= 0 && intLvl5Mod3Ict2 >= 0
					&& intLvl5Mod3Ict3 >= 0) {
				lvl5Mod3Stat.setText("20");
				lvl5Mod3Cred = 20;
			} else {
				lvl5Mod3Stat.setText("0");
				lvl5Mod3Cred = 0;
			}

			if ((intLvl5Mod3Ict1 < 30 || intLvl5Mod3Ict2 < 30 || intLvl5Mod3Ict3 < 30) && intLvl5Mod3Ict1 <= 100
					&& intLvl5Mod3Ict2 <= 100 && intLvl5Mod3Ict3 <= 100 && intLvl5Mod3Ict1 >= 0 && intLvl5Mod3Ict2 >= 0
					&& intLvl5Mod3Ict3 >= 0) {
				lvl5Mod3Retake.setText("!");
			} else {
				lvl5Mod3Retake.setText("");
			}

			// conditions for module 4
			if (intLvl5Mod4Ict1 >= 40 && intLvl5Mod4Ict2 >= 40 && intLvl5Mod4Ict3 >= 40 && intLvl5Mod4Ict1 <= 100
					&& intLvl5Mod4Ict2 <= 100 && intLvl5Mod4Ict3 <= 100 && intLvl5Mod4Ict1 >= 0 && intLvl5Mod4Ict2 >= 0
					&& intLvl5Mod4Ict3 >= 0) {
				lvl5Mod4Stat.setText("20");
				lvl5Mod4Cred = 20;
			} else {
				lvl5Mod4Stat.setText("0");
				lvl5Mod4Cred = 0;
			}

			if ((intLvl5Mod4Ict1 < 30 || intLvl5Mod4Ict2 < 30 || intLvl5Mod4Ict3 < 30) && intLvl5Mod4Ict1 <= 100
					&& intLvl5Mod4Ict2 <= 100 && intLvl5Mod4Ict3 <= 100 && intLvl5Mod4Ict1 >= 0 && intLvl5Mod4Ict2 >= 0
					&& intLvl5Mod4Ict3 >= 0) {
				lvl5Mod4Retake.setText("!");
			} else {
				lvl5Mod4Retake.setText("");
			}

			// conditions for module 5
			if (intLvl5Mod5Ict1 >= 40 && intLvl5Mod5Ict2 >= 40 && intLvl5Mod5Ict3 >= 40 && intLvl5Mod5Ict1 <= 100
					&& intLvl5Mod5Ict2 <= 100 && intLvl5Mod5Ict3 <= 100 && intLvl5Mod5Ict1 >= 0 && intLvl5Mod5Ict2 >= 0
					&& intLvl5Mod5Ict3 >= 0) {
				lvl5Mod5Stat.setText("20");
				lvl5Mod5Cred = 20;
			} else {
				lvl5Mod5Stat.setText("0");
				lvl5Mod5Cred = 0;
			}

			if ((intLvl5Mod5Ict1 < 30 || intLvl5Mod5Ict2 < 30 || intLvl5Mod5Ict3 < 30) && intLvl5Mod5Ict1 <= 100
					&& intLvl5Mod5Ict2 <= 100 && intLvl5Mod5Ict3 <= 100 && intLvl5Mod5Ict1 >= 0 && intLvl5Mod5Ict2 >= 0
					&& intLvl5Mod5Ict3 >= 0) {
				lvl5Mod5Retake.setText("!");
			} else {
				lvl5Mod5Retake.setText("");
			}

			// conditions for module 6
			if (intLvl5Mod6Ict1 >= 40 && intLvl5Mod6Ict2 >= 40 && intLvl5Mod6Ict3 >= 40 && intLvl5Mod6Ict1 <= 100
					&& intLvl5Mod6Ict2 <= 100 && intLvl5Mod6Ict3 <= 100 && intLvl5Mod6Ict1 >= 0 && intLvl5Mod6Ict2 >= 0
					&& intLvl5Mod6Ict3 >= 0) {
				lvl5Mod6Stat.setText("20");
				lvl5Mod6Cred = 20;
			} else {
				lvl5Mod6Stat.setText("0");
				lvl5Mod6Cred = 0;
			}

			if ((intLvl5Mod6Ict1 < 30 || intLvl5Mod6Ict2 < 30 || intLvl5Mod6Ict3 < 30) && intLvl5Mod6Ict1 <= 100
					&& intLvl5Mod6Ict2 <= 100 && intLvl5Mod6Ict3 <= 100 && intLvl5Mod6Ict1 >= 0 && intLvl5Mod6Ict2 >= 0
					&& intLvl5Mod6Ict3 >= 0) {
				lvl5Mod6Retake.setText("!");
			} else {
				lvl5Mod6Retake.setText("");
			}

			// final code to calculate total credits and display them for level
			// 5
			lvl5TotCred = lvl5Mod1Cred + lvl5Mod2Cred + lvl5Mod3Cred + lvl5Mod4Cred + lvl5Mod5Cred + lvl5Mod6Cred;
			lblLvl5TotCred.setText(String.valueOf(lvl5TotCred));

			/**
			 * this condition checks if the student can pass to Level 6 if he
			 * has achieved 100 credits. If not satisfied button 'Enter' is
			 * disabled for level 6
			 */
			if (lvl5TotCred < 100) {
				lvl6Ent.setDisable(true);
			} else {
				lvl6Ent.setDisable(false);
			}

			// it also ensures that marks are added correctly without constant
			// back tracking
			if (lvl5TotCred >= 100) {
				lvl5Ent.setDisable(true);
			} else {
				lvl5Ent.setDisable(false);
			}

		}

		// catch block in the 'try-catch' code is written to display 'Null' if
		// an invalid entry in given
		catch (Exception exp2) {

			lvl5Mod1Stat.setText("");
			lvl5Mod1Cred = 0;
			lvl5Mod1Retake.setText("");

			lvl5Mod2Stat.setText("");
			lvl5Mod2Cred = 0;
			lvl5Mod2Retake.setText("");

			lvl5Mod3Stat.setText("");
			lvl5Mod3Cred = 0;
			lvl5Mod3Retake.setText("");

			lvl5Mod4Stat.setText("");
			lvl5Mod4Cred = 0;
			lvl5Mod4Retake.setText("");

			lvl5Mod5Stat.setText("");
			lvl5Mod5Cred = 0;
			lvl5Mod5Retake.setText("");

			lvl5Mod6Stat.setText("");
			lvl5Mod6Cred = 0;
			lvl5Mod6Retake.setText("");

			lblLvl5TotCred.setText("Null");
			lvl5TotCred = 0;

			lvl5Ent.setDisable(true);
		}

	}

	// method for the clear button in level 5 to clear all values in text
	// fields,labels and variables
	public void ClearLvl5(ActionEvent d) {
		lvl5Mod1Ict1.clear();
		lvl5Mod1Ict2.clear();
		lvl5Mod1Ict3.clear();
		lvl5Mod1Stat.setText("");
		lvl5Mod1Cred = 0;
		lvl5Mod1Retake.setText("");

		lvl5Mod2Ict1.clear();
		lvl5Mod2Ict2.clear();
		lvl5Mod2Ict3.clear();
		lvl5Mod2Stat.setText("");
		lvl5Mod2Cred = 0;
		lvl5Mod2Retake.setText("");

		lvl5Mod3Ict1.clear();
		lvl5Mod3Ict2.clear();
		lvl5Mod3Ict3.clear();
		lvl5Mod3Stat.setText("");
		lvl5Mod3Cred = 0;
		lvl5Mod3Retake.setText("");

		lvl5Mod4Ict1.clear();
		lvl5Mod4Ict2.clear();
		lvl5Mod4Ict3.clear();
		lvl5Mod4Stat.setText("");
		lvl5Mod4Cred = 0;
		lvl5Mod4Retake.setText("");

		lvl5Mod5Ict1.clear();
		lvl5Mod5Ict2.clear();
		lvl5Mod5Ict3.clear();
		lvl5Mod5Stat.setText("");
		lvl5Mod5Cred = 0;
		lvl5Mod5Retake.setText("");

		lvl5Mod6Ict1.clear();
		lvl5Mod6Ict2.clear();
		lvl5Mod6Ict3.clear();
		lvl5Mod6Stat.setText("");
		lvl5Mod6Cred = 0;
		lvl5Mod6Retake.setText("");

		lblLvl5TotCred.setText("");
		lvl5TotCred = 0;

		lvl5Ent.setDisable(false);

	}

	public int lvl6TotCred; // total credits obtained in level 5
	public int lvl6Mod1Cred; // credits obtained in level 6 module 1
	public int lvl6Mod2Cred; // credits obtained in level 6 module 2
	public int lvl6Mod3Cred; // credits obtained in level 6 module 3
	public int lvl6Mod4Cred; // credits obtained in level 6 module 4
	public int lvl6Mod5Cred; // credits obtained in level 6 module 4
	public int lvl6Mod6Cred; // credits obtained in level 6 module 5

	public int intLvl6Mod1Ict1;
	public int intLvl6Mod1Ict2;
	public int intLvl6Mod1Ict3;

	public int intLvl6Mod2Ict1;
	public int intLvl6Mod2Ict2;
	public int intLvl6Mod2Ict3;

	public int intLvl6Mod3Ict1;
	public int intLvl6Mod3Ict2;
	public int intLvl6Mod3Ict3;

	public int intLvl6Mod4Ict1;
	public int intLvl6Mod4Ict2;
	public int intLvl6Mod4Ict3;

	public int intLvl6Mod5Ict1;
	public int intLvl6Mod5Ict2;
	public int intLvl6Mod5Ict3;

	public int intLvl6Mod6Ict1;
	public int intLvl6Mod6Ict2;
	public int intLvl6Mod6Ict3;

	// this method is written to manipulate the 'Enter' button in the Level 06
	// section
	public void EnterLvl6(ActionEvent e) throws Exception {

		try {

			// declaring variables to capture integer values entered into the
			// text-fields
			int intLvl6Mod1Ict1 = Integer.parseInt(lvl6Mod1Ict1.getText());
			int intLvl6Mod1Ict2 = Integer.parseInt(lvl6Mod1Ict2.getText());
			int intLvl6Mod1Ict3 = Integer.parseInt(lvl6Mod1Ict3.getText());

			int intLvl6Mod2Ict1 = Integer.parseInt(lvl6Mod2Ict1.getText());
			int intLvl6Mod2Ict2 = Integer.parseInt(lvl6Mod2Ict2.getText());
			int intLvl6Mod2Ict3 = Integer.parseInt(lvl6Mod2Ict3.getText());

			int intLvl6Mod3Ict1 = Integer.parseInt(lvl6Mod3Ict1.getText());
			int intLvl6Mod3Ict2 = Integer.parseInt(lvl6Mod3Ict2.getText());
			int intLvl6Mod3Ict3 = Integer.parseInt(lvl6Mod3Ict3.getText());

			int intLvl6Mod4Ict1 = Integer.parseInt(lvl6Mod4Ict1.getText());
			int intLvl6Mod4Ict2 = Integer.parseInt(lvl6Mod4Ict2.getText());
			int intLvl6Mod4Ict3 = Integer.parseInt(lvl6Mod4Ict3.getText());

			int intLvl6Mod5Ict1 = Integer.parseInt(lvl6Mod5Ict1.getText());
			int intLvl6Mod5Ict2 = Integer.parseInt(lvl6Mod5Ict2.getText());
			int intLvl6Mod5Ict3 = Integer.parseInt(lvl6Mod5Ict3.getText());

			int intLvl6Mod6Ict1 = Integer.parseInt(lvl6Mod6Ict1.getText());
			int intLvl6Mod6Ict2 = Integer.parseInt(lvl6Mod6Ict2.getText());
			int intLvl6Mod6Ict3 = Integer.parseInt(lvl6Mod6Ict3.getText());

			// conditions to check the marks of modules in Level 06
			if (intLvl6Mod1Ict1 >= 40 && intLvl6Mod1Ict2 >= 40 && intLvl6Mod1Ict3 >= 40 && intLvl6Mod1Ict1 <= 100
					&& intLvl6Mod1Ict2 <= 100 && intLvl6Mod1Ict3 <= 100 && intLvl6Mod1Ict1 >= 0 && intLvl6Mod1Ict2 >= 0
					&& intLvl6Mod1Ict3 >= 0) {
				lvl6Mod1Stat.setText("20");
				lvl6Mod1Cred = 20;
			} else {
				lvl6Mod1Stat.setText("0");
				lvl6Mod1Cred = 0;
			}

			if ((intLvl6Mod1Ict1 < 30 || intLvl6Mod1Ict2 < 30 || intLvl6Mod1Ict3 < 30) && intLvl6Mod1Ict1 <= 100
					&& intLvl6Mod1Ict2 <= 100 && intLvl6Mod1Ict3 <= 100 && intLvl6Mod1Ict1 >= 0 && intLvl6Mod1Ict2 >= 0
					&& intLvl6Mod1Ict3 >= 0) {
				lvl6Mod1Retake.setText(" !");
			} else {
				lvl6Mod1Retake.setText("");
			}

			if (intLvl6Mod2Ict1 >= 40 && intLvl6Mod2Ict2 >= 40 && intLvl6Mod2Ict3 >= 40 && intLvl6Mod2Ict1 <= 100
					&& intLvl6Mod2Ict2 <= 100 && intLvl6Mod2Ict3 <= 100 && intLvl6Mod2Ict1 >= 0 && intLvl6Mod2Ict2 >= 0
					&& intLvl6Mod2Ict3 >= 0) {
				lvl6Mod2Stat.setText("20");
				lvl6Mod2Cred = 20;
			} else {
				lvl6Mod2Stat.setText("0");
				lvl6Mod2Cred = 0;
			}

			if ((intLvl6Mod2Ict1 < 30 || intLvl6Mod2Ict2 < 30 || intLvl6Mod2Ict3 < 30) && intLvl6Mod2Ict1 <= 100
					&& intLvl6Mod2Ict2 <= 100 && intLvl6Mod2Ict3 <= 100 && intLvl6Mod2Ict1 >= 0 && intLvl6Mod2Ict2 >= 0
					&& intLvl6Mod2Ict3 >= 0) {
				lvl6Mod2Retake.setText(" !");
			} else {
				lvl6Mod2Retake.setText("");
			}

			if (intLvl6Mod3Ict1 >= 40 && intLvl6Mod3Ict2 >= 40 && intLvl6Mod3Ict3 >= 40 && intLvl6Mod3Ict1 <= 100
					&& intLvl6Mod3Ict2 <= 100 && intLvl6Mod3Ict3 <= 100 && intLvl6Mod3Ict1 >= 0 && intLvl6Mod3Ict2 >= 0
					&& intLvl6Mod3Ict3 >= 0) {
				lvl6Mod3Stat.setText("20");
				lvl6Mod3Cred = 20;
			} else {
				lvl6Mod3Stat.setText("0");
				lvl6Mod3Cred = 0;
			}

			if ((intLvl6Mod3Ict1 < 30 || intLvl6Mod3Ict2 < 30 || intLvl6Mod3Ict3 < 30) && intLvl6Mod3Ict1 <= 100
					&& intLvl6Mod3Ict2 <= 100 && intLvl6Mod3Ict3 <= 100 && intLvl6Mod3Ict1 >= 0 && intLvl6Mod3Ict2 >= 0
					&& intLvl6Mod3Ict3 >= 0) {
				lvl6Mod3Retake.setText(" !");
			} else {
				lvl6Mod3Retake.setText("");
			}

			if (intLvl6Mod4Ict1 >= 40 && intLvl6Mod4Ict2 >= 40 && intLvl6Mod4Ict3 >= 40 && intLvl6Mod4Ict1 <= 100
					&& intLvl6Mod4Ict2 <= 100 && intLvl6Mod4Ict3 <= 100 && intLvl6Mod4Ict1 >= 0 && intLvl6Mod4Ict2 >= 0
					&& intLvl6Mod4Ict3 >= 0) {
				lvl6Mod4Stat.setText("20");
				lvl6Mod4Cred = 20;
			} else {
				lvl6Mod4Stat.setText("0");
				lvl6Mod4Cred = 0;
			}

			if ((intLvl6Mod4Ict1 < 30 || intLvl6Mod4Ict2 < 30 || intLvl6Mod4Ict3 < 30) && intLvl6Mod4Ict1 <= 100
					&& intLvl6Mod4Ict2 <= 100 && intLvl6Mod4Ict3 <= 100 && intLvl6Mod4Ict1 >= 0 && intLvl6Mod4Ict2 >= 0
					&& intLvl6Mod4Ict3 >= 0) {
				lvl6Mod4Retake.setText(" !");
			} else {
				lvl6Mod4Retake.setText("");
			}

			if (intLvl6Mod5Ict1 >= 40 && intLvl6Mod5Ict2 >= 40 && intLvl6Mod5Ict3 >= 40 && intLvl6Mod5Ict1 <= 100
					&& intLvl6Mod5Ict2 <= 100 && intLvl6Mod5Ict3 <= 100 && intLvl6Mod5Ict1 >= 0 && intLvl6Mod5Ict2 >= 0
					&& intLvl6Mod5Ict3 >= 0) {
				lvl6Mod5Stat.setText("20");
				lvl6Mod5Cred = 20;
			} else {
				lvl6Mod5Stat.setText("0");
				lvl6Mod5Cred = 0;
			}

			if ((intLvl6Mod5Ict1 < 30 || intLvl6Mod5Ict2 < 30 || intLvl6Mod5Ict3 < 30) && intLvl6Mod5Ict1 <= 100
					&& intLvl6Mod5Ict2 <= 100 && intLvl6Mod5Ict3 <= 100 && intLvl6Mod5Ict1 >= 0 && intLvl6Mod5Ict2 >= 0
					&& intLvl6Mod5Ict3 >= 0) {
				lvl6Mod5Retake.setText(" !");
			} else {
				lvl6Mod5Retake.setText("");
			}

			if (intLvl6Mod6Ict1 >= 40 && intLvl6Mod6Ict2 >= 40 && intLvl6Mod6Ict3 >= 40 && intLvl6Mod6Ict1 <= 100
					&& intLvl6Mod6Ict2 <= 100 && intLvl6Mod6Ict3 <= 100 && intLvl6Mod6Ict1 >= 0 && intLvl6Mod6Ict2 >= 0
					&& intLvl6Mod6Ict3 >= 0) {
				lvl6Mod6Stat.setText("20");
				lvl6Mod6Cred = 20;
			} else {
				lvl6Mod6Stat.setText("0");
				lvl6Mod6Cred = 0;
			}

			if ((intLvl6Mod6Ict1 < 30 || intLvl6Mod6Ict2 < 30 || intLvl6Mod6Ict3 < 30) && intLvl6Mod6Ict1 <= 100
					&& intLvl6Mod6Ict2 <= 100 && intLvl6Mod6Ict3 <= 100 && intLvl6Mod6Ict1 >= 0 && intLvl6Mod6Ict2 >= 0
					&& intLvl6Mod6Ict3 >= 0) {
				lvl6Mod6Retake.setText(" !");
			} else {
				lvl6Mod6Retake.setText("");
			}

			lvl6TotCred = lvl6Mod1Cred + lvl6Mod2Cred + lvl6Mod3Cred + lvl6Mod4Cred + lvl6Mod5Cred + lvl6Mod6Cred;
			lblLvl6TotCred.setText(String.valueOf(lvl6TotCred));

			// it also ensures that marks are added correctly without constant
			// back tracking
			if (lvl6TotCred >= 100) {
				lvl6Ent.setDisable(true);
			} else {
				lvl6Ent.setDisable(false);
			}

		}
		// catch block in the 'try-catch' code is written to display 'Null' if
		// an invalid entry in given
		catch (Exception exp3) {

			lvl6Mod1Stat.setText("");
			lvl6Mod1Cred = 0;
			lvl6Mod1Retake.setText("");

			lvl6Mod2Stat.setText("");
			lvl6Mod2Cred = 0;
			lvl6Mod2Retake.setText("");

			lvl6Mod3Stat.setText("");
			lvl6Mod3Cred = 0;
			lvl6Mod3Retake.setText("");

			lvl6Mod4Stat.setText("");
			lvl6Mod4Cred = 0;
			lvl6Mod4Retake.setText("");

			lvl6Mod5Stat.setText("");
			lvl6Mod5Cred = 0;
			lvl6Mod5Retake.setText("");

			lvl6Mod6Stat.setText("");
			lvl6Mod6Cred = 0;
			lvl6Mod6Retake.setText("");

			lblLvl6TotCred.setText("Null");
			lvl6TotCred = 0;
		}
	}

	// method for the clear button in level 6 to clear all values in text
	// fields,labels and variables
	public void ClearLvl6(ActionEvent f) {
		lvl6Mod1Ict1.clear();
		lvl6Mod1Ict2.clear();
		lvl6Mod1Ict3.clear();
		lvl6Mod1Stat.setText("");
		lvl6Mod1Cred = 0;
		lvl6Mod1Retake.setText("");

		lvl6Mod2Ict1.clear();
		lvl6Mod2Ict2.clear();
		lvl6Mod2Ict3.clear();
		lvl6Mod2Stat.setText("");
		lvl6Mod2Cred = 0;
		lvl6Mod2Retake.setText("");

		lvl6Mod3Ict1.clear();
		lvl6Mod3Ict2.clear();
		lvl6Mod3Ict3.clear();
		lvl6Mod3Stat.setText("");
		lvl6Mod3Cred = 0;
		lvl6Mod3Retake.setText("");

		lvl6Mod4Ict1.clear();
		lvl6Mod4Ict2.clear();
		lvl6Mod4Ict3.clear();
		lvl6Mod4Stat.setText("");
		lvl6Mod4Cred = 0;
		lvl6Mod4Retake.setText("");

		lvl6Mod5Ict1.clear();
		lvl6Mod5Ict2.clear();
		lvl6Mod5Ict3.clear();
		lvl6Mod5Stat.setText("");
		lvl6Mod5Cred = 0;
		lvl6Mod5Retake.setText("");

		lvl6Mod6Ict1.clear();
		lvl6Mod6Ict2.clear();
		lvl6Mod6Ict3.clear();
		lvl6Mod6Stat.setText("");
		lvl6Mod6Cred = 0;
		lvl6Mod6Retake.setText("");

		lblLvl6TotCred.setText("");
		lvl6TotCred = 0;

		lvl6Ent.setDisable(false);

	}

	public int intCondoneMod1 = 0; // condoned credits given to module 1 in
									// level 4
	public int intCondoneMod2 = 0; // condoned credits given to module 2 in
									// level 4
	public int intCondoneMod3 = 0; // condoned credits given to module 3 in
									// level 4
	public int intCondoneMod4 = 0; // condoned credits given to module 4 in
									// level 4
	public int intCondoneMod5 = 0; // condoned credits given to module 5 in
									// level 4
	public int intCondoneMod6 = 0; // condoned credits given to module 6 in
									// level 4
	public int count; // the count variable checks the number check boxes have
						// been ticked (cannot be more than 2)

	public void CondoneEnter(ActionEvent condoneE) {
		count = 0;

		if (cbMod1.isSelected()) {
			intCondoneMod1 = 20;
			lvl4Mod1Stat.setText("20 C");
			count++;
		} else {
			intCondoneMod1 = 0;
		}

		if (cbMod2.isSelected()) {
			intCondoneMod2 = 20;
			lvl4Mod2Stat.setText("20 C");
			count++;
		} else {
			intCondoneMod2 = 0;
		}

		if (cbMod3.isSelected()) {
			intCondoneMod3 = 20;
			lvl4Mod3Stat.setText("20 C");
			count++;
		} else {
			lvl4Mod3Cred = 0;
		}

		if (cbMod4.isSelected()) {
			intCondoneMod4 = 20;
			lvl4Mod4Stat.setText("20 C");
			count++;
		} else {
			lvl4Mod4Cred = 0;
		}

		if (cbMod5.isSelected()) {
			intCondoneMod5 = 20;
			lvl4Mod5Stat.setText("20 C");
			count++;
		} else {
			lvl4Mod5Cred = 0;
		}

		if (cbMod6.isSelected()) {
			intCondoneMod6 = 20;
			lvl4Mod6Stat.setText("20 C");
			count++;
		} else {
			lvl4Mod6Cred = 0;
		}

		if (count > 2) {
			condoneStat.setText("Can condone only 2 Modules (Press 'Clear')");
		}

	}

	// variable declarations for the total marks in each module
	// level 5
	public int lvl5Mod1Tot;
	public int lvl5Mod2Tot;
	public int lvl5Mod3Tot;
	public int lvl5Mod4Tot;
	public int lvl5Mod5Tot;
	public int lvl5Mod6Tot;

	// level 6
	public int lvl6Mod1Tot;
	public int lvl6Mod2Tot;
	public int lvl6Mod3Tot;
	public int lvl6Mod4Tot;
	public int lvl6Mod5Tot;
	public int lvl6Mod6Tot;

	public int totMarks;
	public int totMarksPerc;

	public int min5;
	public int min6;
	public int val5;
	public int val6;
	public int allMin;

	public int arrLvl5;
	public int arrLvl6;
	public int totLvl5;
	public int totLvl6;
	public int subMin;
	public int finDivide;

	public void finalEnter(ActionEvent fE) {

		try {

			// the marks inputed into the text boxes of level 5 are converted to
			// integer type for arithmetic calculations
			int intLvl5Mod1Ict1 = Integer.parseInt(lvl5Mod1Ict1.getText());
			int intLvl5Mod1Ict2 = Integer.parseInt(lvl5Mod1Ict2.getText());
			int intLvl5Mod1Ict3 = Integer.parseInt(lvl5Mod1Ict3.getText());

			int intLvl5Mod2Ict1 = Integer.parseInt(lvl5Mod2Ict1.getText());
			int intLvl5Mod2Ict2 = Integer.parseInt(lvl5Mod2Ict2.getText());
			int intLvl5Mod2Ict3 = Integer.parseInt(lvl5Mod2Ict3.getText());

			int intLvl5Mod3Ict1 = Integer.parseInt(lvl5Mod3Ict1.getText());
			int intLvl5Mod3Ict2 = Integer.parseInt(lvl5Mod3Ict2.getText());
			int intLvl5Mod3Ict3 = Integer.parseInt(lvl5Mod3Ict3.getText());

			int intLvl5Mod4Ict1 = Integer.parseInt(lvl5Mod4Ict1.getText());
			int intLvl5Mod4Ict2 = Integer.parseInt(lvl5Mod4Ict2.getText());
			int intLvl5Mod4Ict3 = Integer.parseInt(lvl5Mod4Ict3.getText());

			int intLvl5Mod5Ict1 = Integer.parseInt(lvl5Mod5Ict1.getText());
			int intLvl5Mod5Ict2 = Integer.parseInt(lvl5Mod5Ict2.getText());
			int intLvl5Mod5Ict3 = Integer.parseInt(lvl5Mod5Ict3.getText());

			int intLvl5Mod6Ict1 = Integer.parseInt(lvl5Mod6Ict1.getText());
			int intLvl5Mod6Ict2 = Integer.parseInt(lvl5Mod6Ict2.getText());
			int intLvl5Mod6Ict3 = Integer.parseInt(lvl5Mod6Ict3.getText());

			// the marks inputed into the text boxes of level 6 are converted to
			// integer type for arithmetic calculations
			int intLvl6Mod1Ict1 = Integer.parseInt(lvl6Mod1Ict1.getText());
			int intLvl6Mod1Ict2 = Integer.parseInt(lvl6Mod1Ict2.getText());
			int intLvl6Mod1Ict3 = Integer.parseInt(lvl6Mod1Ict3.getText());

			int intLvl6Mod2Ict1 = Integer.parseInt(lvl6Mod2Ict1.getText());
			int intLvl6Mod2Ict2 = Integer.parseInt(lvl6Mod2Ict2.getText());
			int intLvl6Mod2Ict3 = Integer.parseInt(lvl6Mod2Ict3.getText());

			int intLvl6Mod3Ict1 = Integer.parseInt(lvl6Mod3Ict1.getText());
			int intLvl6Mod3Ict2 = Integer.parseInt(lvl6Mod3Ict2.getText());
			int intLvl6Mod3Ict3 = Integer.parseInt(lvl6Mod3Ict3.getText());

			int intLvl6Mod4Ict1 = Integer.parseInt(lvl6Mod4Ict1.getText());
			int intLvl6Mod4Ict2 = Integer.parseInt(lvl6Mod4Ict2.getText());
			int intLvl6Mod4Ict3 = Integer.parseInt(lvl6Mod4Ict3.getText());

			int intLvl6Mod5Ict1 = Integer.parseInt(lvl6Mod5Ict1.getText());
			int intLvl6Mod5Ict2 = Integer.parseInt(lvl6Mod5Ict2.getText());
			int intLvl6Mod5Ict3 = Integer.parseInt(lvl6Mod5Ict3.getText());

			int intLvl6Mod6Ict1 = Integer.parseInt(lvl6Mod6Ict1.getText());
			int intLvl6Mod6Ict2 = Integer.parseInt(lvl6Mod6Ict2.getText());
			int intLvl6Mod6Ict3 = Integer.parseInt(lvl6Mod6Ict3.getText());

			// these variables check the total marks of each module in levels 5
			// and 6
			// in level 5
			int lvl5Mod1Tot = intLvl5Mod1Ict1 + intLvl5Mod1Ict2 + intLvl5Mod1Ict3;
			int lvl5Mod2Tot = intLvl5Mod2Ict1 + intLvl5Mod2Ict2 + intLvl5Mod2Ict3;
			int lvl5Mod3Tot = intLvl5Mod3Ict1 + intLvl5Mod3Ict2 + intLvl5Mod3Ict3;
			int lvl5Mod4Tot = intLvl5Mod4Ict1 + intLvl5Mod4Ict2 + intLvl5Mod4Ict3;
			int lvl5Mod5Tot = intLvl5Mod5Ict1 + intLvl5Mod5Ict2 + intLvl5Mod5Ict3;
			int lvl5Mod6Tot = intLvl5Mod6Ict1 + intLvl5Mod6Ict2 + intLvl5Mod6Ict3;

			// in level 6
			int lvl6Mod1Tot = intLvl6Mod1Ict1 + intLvl6Mod1Ict2 + intLvl6Mod1Ict3;
			int lvl6Mod2Tot = intLvl6Mod2Ict1 + intLvl6Mod2Ict2 + intLvl6Mod2Ict3;
			int lvl6Mod3Tot = intLvl6Mod3Ict1 + intLvl6Mod3Ict2 + intLvl6Mod3Ict3;
			int lvl6Mod4Tot = intLvl6Mod4Ict1 + intLvl6Mod4Ict2 + intLvl6Mod4Ict3;
			int lvl6Mod5Tot = intLvl6Mod5Ict1 + intLvl6Mod5Ict2 + intLvl6Mod5Ict3;
			int lvl6Mod6Tot = intLvl6Mod6Ict1 + intLvl6Mod6Ict2 + intLvl6Mod6Ict3;

			int totMarks = lvl5Mod1Tot + lvl5Mod2Tot + lvl5Mod3Tot + lvl5Mod4Tot + lvl5Mod5Tot + lvl5Mod6Tot
					+ lvl6Mod1Tot + lvl6Mod2Tot + lvl6Mod3Tot + lvl6Mod4Tot + lvl6Mod5Tot + lvl6Mod6Tot;

			double totMarksPerc = (totMarks / 3600.00) * 100;

			if (lvl4TotCred == 120 && lvl5TotCred == 120 && lvl6TotCred == 120) {
				qualStat.setText("qualified with Hons Degree");

				if (totMarksPerc >= 70.0 && totMarksPerc <= 100.0) {
					qualStat.setText("qualified with Hons Degree");
					classStat.setText("1st Class");

				}

				if (totMarksPerc >= 60.0 && totMarksPerc <= 69.0) {
					qualStat.setText("qualified with Hons Degree");
					classStat.setText("2nd Upper");
				}

				if (totMarksPerc >= 50.0 && totMarksPerc <= 59.0) {
					qualStat.setText("qualified with Hons Degree");
					classStat.setText("2nd Lower");
				}

				if (totMarksPerc >= 40.0 && totMarksPerc <= 49.0) {
					qualStat.setText("qualified with Hons Degree");
					classStat.setText("3rd Class");
				}

			}

		} catch (Exception exp4) {
			classStat.setText("");
			if (lvl4TotCred < 100) {
				qualStat.setText("No qualification");
			}

			if (lvl4TotCred == 100) {
				qualStat.setText("Passed to Level 5");
			}

			if (lvl4TotCred == 120) {
				qualStat.setText("qualified with Cert HE and pass to Level 5");
			}

			if (lvl4TotCred == 120 && lvl5TotCred == 120) {
				qualStat.setText("qualified with Dip HE and passed to Level 6");
			}

			if (lvl4TotCred == 120 && lvl5TotCred == 100) {
				qualStat.setText("qualified with Cert HE & pass to Level 6");
			}

			if (lvl4TotCred == 100 && lvl5TotCred == 100) {
				qualStat.setText("Passed to Level 6");
			}

			if (lvl4TotCred <= 100 && lvl5TotCred <= 100
					&& lvl6TotCred >= 60 && lvl6TotCred < 120) {
				qualStat.setText("qualified with Non Hons Degree");
			}
		}
	}

	// this method is created for the button that calculates the final class for
	// an hons degree
	public void finalClass(ActionEvent fX) throws Exception {

		// the marks inputed into the text boxes of level 5 are converted to
		// integer type for arithmetic calculations
		int intLvl5Mod1Ict1 = Integer.parseInt(lvl5Mod1Ict1.getText());
		int intLvl5Mod1Ict2 = Integer.parseInt(lvl5Mod1Ict2.getText());
		int intLvl5Mod1Ict3 = Integer.parseInt(lvl5Mod1Ict3.getText());

		int intLvl5Mod2Ict1 = Integer.parseInt(lvl5Mod2Ict1.getText());
		int intLvl5Mod2Ict2 = Integer.parseInt(lvl5Mod2Ict2.getText());
		int intLvl5Mod2Ict3 = Integer.parseInt(lvl5Mod2Ict3.getText());

		int intLvl5Mod3Ict1 = Integer.parseInt(lvl5Mod3Ict1.getText());
		int intLvl5Mod3Ict2 = Integer.parseInt(lvl5Mod3Ict2.getText());
		int intLvl5Mod3Ict3 = Integer.parseInt(lvl5Mod3Ict3.getText());

		int intLvl5Mod4Ict1 = Integer.parseInt(lvl5Mod4Ict1.getText());
		int intLvl5Mod4Ict2 = Integer.parseInt(lvl5Mod4Ict2.getText());
		int intLvl5Mod4Ict3 = Integer.parseInt(lvl5Mod4Ict3.getText());

		int intLvl5Mod5Ict1 = Integer.parseInt(lvl5Mod5Ict1.getText());
		int intLvl5Mod5Ict2 = Integer.parseInt(lvl5Mod5Ict2.getText());
		int intLvl5Mod5Ict3 = Integer.parseInt(lvl5Mod5Ict3.getText());

		int intLvl5Mod6Ict1 = Integer.parseInt(lvl5Mod6Ict1.getText());
		int intLvl5Mod6Ict2 = Integer.parseInt(lvl5Mod6Ict2.getText());
		int intLvl5Mod6Ict3 = Integer.parseInt(lvl5Mod6Ict3.getText());

		// the marks inputed into the text boxes of level 6 are converted to
		// integer type for arithmetic calculations
		int intLvl6Mod1Ict1 = Integer.parseInt(lvl6Mod1Ict1.getText());
		int intLvl6Mod1Ict2 = Integer.parseInt(lvl6Mod1Ict2.getText());
		int intLvl6Mod1Ict3 = Integer.parseInt(lvl6Mod1Ict3.getText());

		int intLvl6Mod2Ict1 = Integer.parseInt(lvl6Mod2Ict1.getText());
		int intLvl6Mod2Ict2 = Integer.parseInt(lvl6Mod2Ict2.getText());
		int intLvl6Mod2Ict3 = Integer.parseInt(lvl6Mod2Ict3.getText());

		int intLvl6Mod3Ict1 = Integer.parseInt(lvl6Mod3Ict1.getText());
		int intLvl6Mod3Ict2 = Integer.parseInt(lvl6Mod3Ict2.getText());
		int intLvl6Mod3Ict3 = Integer.parseInt(lvl6Mod3Ict3.getText());

		int intLvl6Mod4Ict1 = Integer.parseInt(lvl6Mod4Ict1.getText());
		int intLvl6Mod4Ict2 = Integer.parseInt(lvl6Mod4Ict2.getText());
		int intLvl6Mod4Ict3 = Integer.parseInt(lvl6Mod4Ict3.getText());

		int intLvl6Mod5Ict1 = Integer.parseInt(lvl6Mod5Ict1.getText());
		int intLvl6Mod5Ict2 = Integer.parseInt(lvl6Mod5Ict2.getText());
		int intLvl6Mod5Ict3 = Integer.parseInt(lvl6Mod5Ict3.getText());

		int intLvl6Mod6Ict1 = Integer.parseInt(lvl6Mod6Ict1.getText());
		int intLvl6Mod6Ict2 = Integer.parseInt(lvl6Mod6Ict2.getText());
		int intLvl6Mod6Ict3 = Integer.parseInt(lvl6Mod6Ict3.getText());

		// these variables check the total marks of each module in levels 5 and
		// 6
		// in level 5
		int lvl5Mod1Tot = intLvl5Mod1Ict1 + intLvl5Mod1Ict2 + intLvl5Mod1Ict3;
		int lvl5Mod2Tot = intLvl5Mod2Ict1 + intLvl5Mod2Ict2 + intLvl5Mod2Ict3;
		int lvl5Mod3Tot = intLvl5Mod3Ict1 + intLvl5Mod3Ict2 + intLvl5Mod3Ict3;
		int lvl5Mod4Tot = intLvl5Mod4Ict1 + intLvl5Mod4Ict2 + intLvl5Mod4Ict3;
		int lvl5Mod5Tot = intLvl5Mod5Ict1 + intLvl5Mod5Ict2 + intLvl5Mod5Ict3;
		int lvl5Mod6Tot = intLvl5Mod6Ict1 + intLvl5Mod6Ict2 + intLvl5Mod6Ict3;

		// in level 6
		int lvl6Mod1Tot = intLvl6Mod1Ict1 + intLvl6Mod1Ict2 + intLvl6Mod1Ict3;
		int lvl6Mod2Tot = intLvl6Mod2Ict1 + intLvl6Mod2Ict2 + intLvl6Mod2Ict3;
		int lvl6Mod3Tot = intLvl6Mod3Ict1 + intLvl6Mod3Ict2 + intLvl6Mod3Ict3;
		int lvl6Mod4Tot = intLvl6Mod4Ict1 + intLvl6Mod4Ict2 + intLvl6Mod4Ict3;
		int lvl6Mod5Tot = intLvl6Mod5Ict1 + intLvl6Mod5Ict2 + intLvl6Mod5Ict3;
		int lvl6Mod6Tot = intLvl6Mod6Ict1 + intLvl6Mod6Ict2 + intLvl6Mod6Ict3;

		int totMarks = lvl5Mod1Tot + lvl5Mod2Tot + lvl5Mod3Tot + lvl5Mod4Tot + lvl5Mod5Tot + lvl5Mod6Tot + lvl6Mod1Tot
				+ lvl6Mod2Tot + lvl6Mod3Tot + lvl6Mod4Tot + lvl6Mod5Tot + lvl6Mod6Tot;

		double totMarksPerc = (totMarks / 3600.00) * 100;

		if (totMarksPerc >= 70.0 && totMarksPerc <= 100.0) {
			qualStat.setText("qualified with Hons Degree");
			classStat.setText("1st Class");

		}

		if (totMarksPerc >= 60.0 && totMarksPerc <= 69.0) {
			qualStat.setText("qualified with Hons Degree");
			classStat.setText("2nd Upper");
		}

		if (totMarksPerc >= 50.0 && totMarksPerc <= 59.0) {
			qualStat.setText("qualified with Hons Degree");
			classStat.setText("2nd Lower");
		}

		if (totMarksPerc >= 40.0 && totMarksPerc <= 49.0) {
			qualStat.setText("qualified with Hons Degree");
			classStat.setText("3rd Class");
		}

	}

	// this method is used for the universal clear button that creates almost an
	// entirely new form for input
	public void finalClear(ActionEvent fC) throws Exception {
		// clearing components in the level 4 portion of GUI
		lvl4Mod1Ict1.clear();
		lvl4Mod1Ict2.clear();
		lvl4Mod1Ict3.clear();
		lvl4Mod1Stat.setText("");
		lvl4Mod1Cred = 0;
		lvl4Mod1Retake.setText("");

		lvl4Mod2Ict1.clear();
		lvl4Mod2Ict2.clear();
		lvl4Mod2Ict3.clear();
		lvl4Mod2Stat.setText("");
		lvl4Mod2Cred = 0;
		lvl4Mod2Retake.setText("");

		lvl4Mod3Ict1.clear();
		lvl4Mod3Ict2.clear();
		lvl4Mod3Ict3.clear();
		lvl4Mod3Stat.setText("");
		lvl4Mod3Cred = 0;
		lvl4Mod3Retake.setText("");

		lvl4Mod4Ict1.clear();
		lvl4Mod4Ict2.clear();
		lvl4Mod4Ict3.clear();
		lvl4Mod4Stat.setText("");
		lvl4Mod4Cred = 0;
		lvl4Mod4Retake.setText("");

		lvl4Mod5Ict1.clear();
		lvl4Mod5Ict2.clear();
		lvl4Mod5Ict3.clear();
		lvl4Mod5Stat.setText("");
		lvl4Mod5Cred = 0;
		lvl4Mod5Retake.setText("");

		lvl4Mod6Ict1.clear();
		lvl4Mod6Ict2.clear();
		lvl4Mod6Ict3.clear();
		lvl4Mod6Stat.setText("");
		lvl4Mod6Cred = 0;
		lvl4Mod6Retake.setText("");

		lblLvl4TotCred.setText("");
		lvl4TotCred = 0;

		cbMod1.setDisable(false);
		cbMod2.setDisable(false);
		cbMod3.setDisable(false);
		cbMod4.setDisable(false);
		cbMod5.setDisable(false);
		cbMod6.setDisable(false);

		intCondoneMod1 = 0;
		intCondoneMod2 = 0;
		intCondoneMod3 = 0;
		intCondoneMod4 = 0;
		intCondoneMod5 = 0;
		intCondoneMod6 = 0;
		count = 0;
		condoneStat.setText("");

		lvl4Ent.setDisable(false);

		// clearing components in the level 5 portion of GUI
		lvl5Mod1Ict1.clear();
		lvl5Mod1Ict2.clear();
		lvl5Mod1Ict3.clear();
		lvl5Mod1Stat.setText("");
		lvl5Mod1Cred = 0;
		lvl5Mod1Retake.setText("");

		lvl5Mod2Ict1.clear();
		lvl5Mod2Ict2.clear();
		lvl5Mod2Ict3.clear();
		lvl5Mod2Stat.setText("");
		lvl5Mod2Cred = 0;
		lvl5Mod2Retake.setText("");

		lvl5Mod3Ict1.clear();
		lvl5Mod3Ict2.clear();
		lvl5Mod3Ict3.clear();
		lvl5Mod3Stat.setText("");
		lvl5Mod3Cred = 0;
		lvl5Mod3Retake.setText("");

		lvl5Mod4Ict1.clear();
		lvl5Mod4Ict2.clear();
		lvl5Mod4Ict3.clear();
		lvl5Mod4Stat.setText("");
		lvl5Mod4Cred = 0;
		lvl5Mod4Retake.setText("");

		lvl5Mod5Ict1.clear();
		lvl5Mod5Ict2.clear();
		lvl5Mod5Ict3.clear();
		lvl5Mod5Stat.setText("");
		lvl5Mod5Cred = 0;
		lvl5Mod5Retake.setText("");

		lvl5Mod6Ict1.clear();
		lvl5Mod6Ict2.clear();
		lvl5Mod6Ict3.clear();
		lvl5Mod6Stat.setText("");
		lvl5Mod6Cred = 0;
		lvl5Mod6Retake.setText("");

		lblLvl5TotCred.setText("");
		lvl5TotCred = 0;

		// clearing components in the level 6 portion of GUI
		lvl6Mod1Ict1.clear();
		lvl6Mod1Ict2.clear();
		lvl6Mod1Ict3.clear();
		lvl6Mod1Stat.setText("");
		lvl6Mod1Cred = 0;
		lvl6Mod1Retake.setText("");

		lvl6Mod2Ict1.clear();
		lvl6Mod2Ict2.clear();
		lvl6Mod2Ict3.clear();
		lvl6Mod2Stat.setText("");
		lvl6Mod2Cred = 0;
		lvl6Mod2Retake.setText("");

		lvl6Mod3Ict1.clear();
		lvl6Mod3Ict2.clear();
		lvl6Mod3Ict3.clear();
		lvl6Mod3Stat.setText("");
		lvl6Mod3Cred = 0;
		lvl6Mod3Retake.setText("");

		lvl6Mod4Ict1.clear();
		lvl6Mod4Ict2.clear();
		lvl6Mod4Ict3.clear();
		lvl6Mod4Stat.setText("");
		lvl6Mod4Cred = 0;
		lvl6Mod4Retake.setText("");

		lvl6Mod5Ict1.clear();
		lvl6Mod5Ict2.clear();
		lvl6Mod5Ict3.clear();
		lvl6Mod5Stat.setText("");
		lvl6Mod5Cred = 0;
		lvl6Mod5Retake.setText("");

		lvl6Mod6Ict1.clear();
		lvl6Mod6Ict2.clear();
		lvl6Mod6Ict3.clear();
		lvl6Mod6Stat.setText("");
		lvl6Mod6Cred = 0;
		lvl6Mod6Retake.setText("");

		lblLvl6TotCred.setText("");
		lvl6TotCred = 0;

		qualStat.setText("");
		classStat.setText("");
	}

}
