	//By Andre Nonaka April 2nd 2020
package application;
	
	import java.util.*; 
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.List;
	import java.util.Random;
	
	
	
	import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
	import javafx.event.EventHandler;
	import javafx.geometry.Insets;
	import javafx.geometry.Orientation;
	import javafx.geometry.Pos;
	import javafx.stage.Stage;
	import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
	import javafx.scene.image.Image;
	import javafx.scene.image.ImageView;
	import javafx.scene.layout.AnchorPane;
	import javafx.scene.layout.BorderPane;
	import javafx.scene.layout.FlowPane;
	import javafx.scene.layout.GridPane;
	import javafx.scene.layout.HBox;
	import javafx.scene.layout.Pane;
	import javafx.scene.layout.StackPane;
	import javafx.scene.layout.TilePane;
	import javafx.scene.layout.VBox;
	import javafx.scene.paint.Color;
	import javafx.scene.text.Font;
	import javafx.scene.text.FontWeight;
	
	public class Main extends Application {
	
		private ImageView ivPlayersCase;//Declare ivPlayersCase as ImageView
		private Label lblMessage;//Declare lblMessage as Label
		private Label lbl;//Declare lbl as Label
		private ImageView[][] ivAmounts; //Declare ivAmounts as ImageView
		private BorderPane root;//Declare root as BorderPane
		private BorderPane bottom; //Declare bottom as BorderPane
	  
	    private Image [][] images; //to store original images
	    Image images3; //To store original images
	    Image images4; //To store original images
	    private ImageView  images2; //To store original images
	    private int numImages = 26;//number of images
	    private int rows1 = 0;//Declare rows
	    private int cols1 = 0;//Declare columns
		private String[] amounts; //declare String amounts
		private String[] suitcases; //declare String suitcases
		 private Button[][] buttonArray;// buttons to display images
		    private Image imagesCopy[]; //to store shuffled images
			int round;  //Store # of rounds
			Scene scene; //Declare scene
			Scene scene2; //Declare scene
			int unopenedCases; //Declare unopenedCases as int
			double first; //Declare first as double
			double one ; //Declare one as double
			double two; //Declare two as double
			double three; //Declare three as double
			double four; //Declare four as double
			double five; //Declare five as double
			double six; //Declare six as double
			double eight; //Declare eight as double
			double nine; //Declare nine as double
			double ten; //Declare ten as double
			double eleven; //Declare eleven as double
			double twelve; //Declare twelve as double
			double fourteen; //Declare fourteen as double
			double fifteen; //Declare fifteen as double
			double sixteen; //Declare sixteen as double
			double seventeen; //Declare seventeen as double
			double nineteen; //Declare nineteen as double
			double twenty; //Declare twenty as double
			double twentyone; //Declare twentyone as double
			double twentythree; //Declare twentythree as double
	        double twentyfour; //Declare twentyfour as double
	        double twentysix; //Declare twentysix as double
	        double twentyseven; //Declare twentyseven as double
	        double twentyeight; //Declare twentyeight as double
	        double twentynine; //Declare twentynine as double
	        double thirty; //Declare thirty as double
	        double fourty; //Declare fourty as double
			int caseValue = 0;  //declare caseValue as an int
			int count1 = 0;  //declare count1 as an int
			int numCases = 0;  //declare numCases as an int
	
	
		public void start(Stage primaryStage) {
			try {


				ivPlayersCase = new ImageView(); //declare ivPlayersCase as an ImageView
				ivPlayersCase.setFitWidth(50); //Set width
				ivPlayersCase.setFitHeight(45);//set height
				ivAmounts = new ImageView[13][2]; // declare array of the ivAmounts
				buttonArray = new Button[26][1]; // declare array of the buttonArray 
				TilePane northPanel = new TilePane(); // declare TilePane
				northPanel.setAlignment(Pos.TOP_CENTER); // set allignement
				northPanel.setHgap(10); // set hgap
				northPanel.setVgap(10); //set vgap
				northPanel.setPadding(new Insets(10, 10, 0, 10)); //set padding
	
	
		       	// set the pngs one by one into string called amounts and suitcases
				amounts = new String[] {"0.01", "1", "5", "10", "25", "50", "75", "100", "200", "300", "400",
						"500", "750", "1000", "5000", "10000", "25000", "50000", "75000", "100000",
						"200000", "300000", "400000", "500000", "750000", "1000000"};
				suitcases = new String[] {"case1", "case2", "case3","case4","case5","case6","case7","case8",
						"case9","case10","case11","case12","case13","case14","case15","case16","case17",
						"case18","case19","case20","case21","case22","case23","case24","case25","case26"};
		
				
	
	             images = new Image[26][1]; // declare image array 
	             //String array of money
	              String[] casevalue2 = {"0.01","1","5","10","25","50","75","100","200","300","400","500","750","1000","5000","10000","25000","50000","75000","100000","200000","300000","400000","500000","750000","1000000"}; 
	      		List<String> intList = Arrays.asList(casevalue2);
	    		Collections.shuffle(intList); // Randomize and shuffle Array of of money

                //declare ivTitle as the image title
				ImageView ivTitle = new ImageView(new Image("file:images/dond_logo.png"));
	
				//declare VBOx
				VBox suit = new VBox();
				suit.setAlignment(Pos.TOP_CENTER);
				suit.setSpacing(20);
				//declare VBox
				VBox westPanel = new VBox();
				westPanel.setAlignment(Pos.TOP_CENTER);
				westPanel.setSpacing(10);
				//declare VBox
				VBox eastPanel = new VBox();
				eastPanel.setAlignment(Pos.TOP_CENTER);
				eastPanel.setSpacing(10);
				
		       
	
				int count = 0; //declare integer count
				
				//for loop for ivAmount 
	
				for (int cols = 0; cols < ivAmounts[0].length; cols++)
				{
					for (int rows = 0; rows < ivAmounts.length; rows++)
					{
						ivAmounts[rows][cols] = new ImageView(new Image("file:images/money/" + 
								amounts[count] + ".png"));  // declare ivAmounts and set images money
						ivAmounts[rows][cols].setFitHeight(18); //declare height
						ivAmounts[rows][cols].setFitWidth(127); //declare width
						ivAmounts[rows][cols].setId(amounts[count]); //setId
	
						if (cols == 0)
						{
							westPanel.getChildren().add(ivAmounts[rows][cols]);
						}
						else
						{
							eastPanel.getChildren().add(ivAmounts[rows][cols]);
						}
						count++;
					}
				}
	
			     //declare centerPanel as FlowPane
				FlowPane centerPanel = new FlowPane();
				centerPanel.setPadding(new Insets(0, 10, 0, 10)); //declare setPadding
				centerPanel.setHgap(10); //declare Hgap
				centerPanel.setVgap(10); //declare Vgap
				centerPanel.setAlignment(Pos.CENTER); //declare setAllignment
				centerPanel.getChildren().addAll(northPanel); 
				
				// for loop for buttonArray
				 for (int rows1 = 0; rows1 < buttonArray.length; rows1++)
				 {
				 	for (int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
				 	{

							buttonArray[rows1][cols1] = new Button(); //declare buttonArray button
							for (int i = 0; i < 26; i++)
							{
								buttonArray[rows1][cols1].setTextFill(Color.BLACK);//setTextFill to BLACK
							buttonArray[rows1][cols1].setText(casevalue2[count1]);//set text to clear
							}
							
							images[rows1][cols1] = new Image("file:images/suitcases/" + suitcases[count1] + ".png");
				 			buttonArray[rows1][cols1].setGraphic(new ImageView(images[rows1][cols1])); //set graphic to imageview
				 			buttonArray[rows1][cols1].setPrefSize(60, 60); //set buttonArray size
				 			buttonArray[rows1][cols1].setId(suitcases[count1]); //setId

			        		if (cols1 == 0)
							{
							  northPanel.getChildren().add(buttonArray[rows1][cols1]);
							}
							count1++; 
						}
				}	
				 	//set ButtonArray for Loop
				 for (int rows1 = 0; rows1 < buttonArray.length; rows1++)
				 {
				 	for (int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
				 	{
				 			//set ButtonArray action event
				 			buttonArray[rows1][cols1].setOnAction(new EventHandler<ActionEvent>() {
					 		public void handle(ActionEvent event)
							{
					 			Button btnSelected = (Button) event.getSource(); //set btnSelected event.getSource()
					 			numCases++;
					 			int count2 = 0;
					 			//if first case is selected then do the following
								if(numCases == 1)
								{
									for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
									{
										for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
										{
											if(btnSelected.getId().equals(suitcases[count2]))
											{
												first = Double.valueOf(btnSelected.getText()); //get the btn text and store in first
												images3 = new Image("file:images/suitcases/" + suitcases[count2] + ".png");
												ivPlayersCase.setImage(images3);//set the ivPlayers Case as the button that was selected
												btnSelected.setVisible(false); //set the button as invisible
												lblMessage.setText("Open 6 briefcase(s)!");
											}
											count2++;
										}
									}
								}
					 			//if second case is selected then do the following

								if(numCases == 2)
								{
									for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
									{
										for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
										{
											if(btnSelected.getId().equals(suitcases[count2]))
											{
												one = Double.valueOf(btnSelected.getText()); //get the btn text and store in one
												System.out.println(btnSelected.getText());
												btnSelected.setVisible(false); //set the selected button as invisible
												lblMessage.setText("Open 5 briefcase(s)!"); //set label message as the following
												Alert alert = new Alert(AlertType.INFORMATION); //set alert 
												alert.setHeaderText(null);
												alert.setContentText("Case # 1 contains" + " $" + btnSelected.getText()+ "!"); //set the case #1 as selected button text
												alert.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
												alert.setTitle("Alert Example");
												alert.showAndWait();

											}
											count2++;
										}									
										}
								for (int cols = 0; cols < ivAmounts[0].length; cols++)
								{
									for (int rows = 0; rows < ivAmounts.length; rows++)
									{
										if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
										{
											ivAmounts[rows][cols].setVisible(false);
										}
									}
							}
				 			}
					 			//if third case is selected then do the following

							if(numCases == 3)
							{
								for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
								{
									for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
									{
										if(btnSelected.getId().equals(suitcases[count2]))
										{
											two = Double.valueOf(btnSelected.getText()); //get the btn text and store in two
											System.out.println(btnSelected.getText());
											btnSelected.setVisible(false);
											lblMessage.setText("Open 4 briefcase(s)!"); //set the lbl Message as the text
											Alert alert = new Alert(AlertType.INFORMATION); //set alert
											alert.setHeaderText(null);
											alert.setContentText("Case # 2 contains" + " $" + btnSelected.getText()+ "!"); //set the case #2 as selected button text
											alert.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png"))); //set graphic-
											alert.setTitle("Alert Example");
											alert.showAndWait();

										}
										count2++;
									}									
									}
							for (int cols = 0; cols < ivAmounts[0].length; cols++)
							{
								for (int rows = 0; rows < ivAmounts.length; rows++)
								{
									if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
									{
										ivAmounts[rows][cols].setVisible(false);
									}
								}
						}
							}
				 			//if fourth case is selected then do the following
							if(numCases == 4)
							{
								for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
								{
									for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
									{
										if(btnSelected.getId().equals(suitcases[count2]))
										{
											three = Double.valueOf(btnSelected.getText()); //get the btn text and store in three
											System.out.println(btnSelected.getText());
											btnSelected.setVisible(false); //set the selected button as invisible
											lblMessage.setText("Open 3 briefcase(s)!"); //set lblMessage as the following
											Alert alert = new Alert(AlertType.INFORMATION); //set alert
											alert.setHeaderText(null);
											alert.setContentText("Case # 3 contains" + " $" + btnSelected.getText()+ "!"); //set the case #3 as selected button text
											alert.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
											alert.setTitle("Alert Example");
											alert.showAndWait();

										}
										count2++;
									}									
									}
							for (int cols = 0; cols < ivAmounts[0].length; cols++)
							{
								for (int rows = 0; rows < ivAmounts.length; rows++)
								{
									if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
									{
										ivAmounts[rows][cols].setVisible(false); //set ivAmounts as invisible
									}
								}
						}
							}
				 			//if fifth case is selected then do the following
							if(numCases == 5)
							{
								for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
								{
									for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
									{
										if(btnSelected.getId().equals(suitcases[count2]))
										{
											four = Double.valueOf(btnSelected.getText()); //get the btn text and store in four
											System.out.println(btnSelected.getText());
											btnSelected.setVisible(false); //set selected button to invisible
											lblMessage.setText("Open 2 briefcase(s)!"); //set lblMessage text as the following
											Alert alert = new Alert(AlertType.INFORMATION); //set alert
											alert.setHeaderText(null);
											alert.setContentText("Case # 4 contains" + " $" + btnSelected.getText()+ "!"); //set the case #4 as selected button text
											alert.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png"))); //set graphic
											alert.setTitle("Alert Example"); //set title
											alert.showAndWait();

										}
										count2++;
									}									
									}
							for (int cols = 0; cols < ivAmounts[0].length; cols++)
							{
								for (int rows = 0; rows < ivAmounts.length; rows++)
								{
									if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
									{
										ivAmounts[rows][cols].setVisible(false); //set as invisible
									}
								}
						}
			 			}
							//if sixth case is selected then do the following
							if(numCases == 6)
							{
								for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
								{
									for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
									{
										if(btnSelected.getId().equals(suitcases[count2]))
										{
											five = Double.valueOf(btnSelected.getText()); //get the selected btn text and store in five
											System.out.println(btnSelected.getText());
											btnSelected.setVisible(false); //set the selected button as invisible
											lblMessage.setText("Open 1 briefcase(s)!"); // set lblMessage as the following
											Alert alert = new Alert(AlertType.INFORMATION); //set alert
											alert.setHeaderText(null);
											alert.setContentText("Case # 5 contains" + " $" + btnSelected.getText()+ "!"); //set the case #5 as selected button text
											alert.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
											alert.setTitle("Alert Example"); //set title
											alert.showAndWait();

										}
										count2++;
									}									
									}
							for (int cols = 0; cols < ivAmounts[0].length; cols++)
							{
								for (int rows = 0; rows < ivAmounts.length; rows++)
								{
									if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
									{
										ivAmounts[rows][cols].setVisible(false); //set as invisible
									}
								}
						}
			 			}
							//if seventh case is selected then do the following
							if(numCases == 7)
							{
								for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
								{
									for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
									{
										if(btnSelected.getId().equals(suitcases[count2]))
										{
											six = Double.valueOf(btnSelected.getText());  //get the selected btn text and store in six
											System.out.println(btnSelected.getText());
											btnSelected.setVisible(false); //set the selected button as invisible
											lblMessage.setText("Open 1 briefcase(s)!"); //set lbl Message as the following
											Alert alert = new Alert(AlertType.INFORMATION);
											alert.setHeaderText(null);
											alert.setContentText("Case # 6 contains" + " $" + btnSelected.getText()+ "!"); //set the case #6 as selected button text
											alert.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png"))); //set graphic
											alert.setTitle("Alert Example"); //set title
											alert.showAndWait();

										}
										count2++;
									}									
									}
							for (int cols = 0; cols < ivAmounts[0].length; cols++)
							{
								for (int rows = 0; rows < ivAmounts.length; rows++)
								{
									if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
									{
										//set seven as a double and store the (total - selected cases)
									    double seven = Global.remainingTotal - (one + two + three + four + five +six);
										ivAmounts[rows][cols].setVisible(false); //set ivAmounts as invisible
						                  double bankOffer = (seven/26.0)*(1/10.0); // declare bankOffer as double 
						                  bankOffer = (((int)(bankOffer*100))/100.00); 
						                  Alert alert = new Alert(AlertType.CONFIRMATION); //declare alert
						                  alert.setHeaderText(null);
						                  ButtonType bt9 = new ButtonType("DEAL"); // declare button "DEAL"
						                  ButtonType bt10 = new ButtonType("NO DEAL");//declare button "NO DEAL"
						                  alert.getButtonTypes().clear();
						                  alert.getButtonTypes().addAll(bt9, bt10); //ADD BUTTONS TO ALERT
						                  alert.setContentText("The banker's offer is" + " $" + bankOffer + "\nDeal or no deal?"); //SET CONTENT TEXT TO SAY bankOffer
						                  alert.setTitle("Banker's offer"); //set title
						                  Optional<ButtonType> result = alert.showAndWait();
						                  if (result.get() == bt9) // if users click DEAL 
						                  {
						                	  Alert alert2 = new Alert(AlertType.INFORMATION); //set alert
						                	  alert2.setHeaderText(null);
						                	  //SET CONTENT OF TEXT
						                	  alert2.setContentText("Congratulations...you're going home with $" + bankOffer + "!");
						                	 //set image of alert
						                	  alert2.setGraphic(new ImageView(new Image("file:images/moneybag.png")));
						                	  alert2.setTitle("It's a deal!"); // set title
						                	  Optional<ButtonType> result2 = alert2.showAndWait();

						                  // Enter code here if the user selects 9
						                  if (result2.get() == ButtonType.OK) // if users click OK 
						                  {
						                	  Alert alert3 = new Alert(AlertType.INFORMATION); // set alert
											alert3.setHeaderText(null);
											//set content text of alert to say the original case ivPlayerCase
												alert3.setContentText("You could have gone home with $" + first + "!");
											// set graphic
											alert3.setGraphic(new ImageView(images3));
											alert3.setTitle("Deal or No Deal"); //set title
											Optional<ButtonType> result3 = alert3.showAndWait();
						                  
						                  if (result3.get() == ButtonType.OK) // if users click OK
						                  {
						                	  Alert alert4 = new Alert(AlertType.INFORMATION); //SET ALERT
											alert4.setHeaderText(null); 
											//set content text
												alert4.setContentText("Thank you for playing Deal or No Deal!");
											//set graphic
												alert4.setGraphic(new ImageView(new Image("file:images/dond_icon.png")));
											alert4.setTitle("Game over"); //set title
											alert4.showAndWait();
											System.exit(0); //exit program
						                  if (result.get() == bt10) // if users click NO DEAL
						                  {
						      				event.consume();//do nothing resume program 
						                  }
									}
								}
							}
									}
								}
							}
							}
							//if eight case is selected then do the following

						                  if(numCases == 8) 
											{
												for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
												{
													for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
													{
														if(btnSelected.getId().equals(suitcases[count2]))
														{
															eight = Double.valueOf(btnSelected.getText()); //get the selected btn text and store in eight
															System.out.println(btnSelected.getText());
															btnSelected.setVisible(false); //set the selected button as invisible
															lblMessage.setText("Open 5 briefcase(s)!"); // set lblMessage as the following
															Alert alert5 = new Alert(AlertType.INFORMATION); //set alert
															alert5.setHeaderText(null);
															alert5.setContentText("Case # 7 contains" + " $" + btnSelected.getText()+ "!"); //set the case #7 as selected button text
															alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png"))); //set graphic
															alert5.setTitle("Alert Example"); //set title
															alert5.showAndWait();

														}
														count2++;
													}									
													}
											for (int cols = 0; cols < ivAmounts[0].length; cols++)
											{
												for (int rows = 0; rows < ivAmounts.length; rows++)
												{
													if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
													{
														ivAmounts[rows][cols].setVisible(false); // set as invisible
													}
												}
												}
												}
							//if ninth case is selected then do the following
					 		 if(numCases == 9)
								{
									for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
									{
										for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
										{
											if(btnSelected.getId().equals(suitcases[count2]))
											{
												nine = Double.valueOf(btnSelected.getText()); //get the selected btn text and store in nine
												System.out.println(btnSelected.getText());
												btnSelected.setVisible(false); //set the selected button as invisible
												lblMessage.setText("Open 4 briefcase(s)!"); // set lblMessage as the following
												Alert alert5 = new Alert(AlertType.INFORMATION); //set alert
												alert5.setHeaderText(null);
												alert5.setContentText("Case # 8 contains" + " $" + btnSelected.getText()+ "!"); //set the case #8 as selected button text
												alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
												alert5.setTitle("Alert Example"); //set title
												alert5.showAndWait();

											}
											count2++;
										}									
										}
								for (int cols = 0; cols < ivAmounts[0].length; cols++)
								{
									for (int rows = 0; rows < ivAmounts.length; rows++)
									{
										if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
										{
											ivAmounts[rows][cols].setVisible(false); //set invisible
										}
									}
									}
									}
							//if tenth case is selected then do the following
					 		 if(numCases == 10)
								{
									for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
									{
										for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
										{
											if(btnSelected.getId().equals(suitcases[count2]))
											{
												ten = Double.valueOf(btnSelected.getText()); //get the selected btn text and store in ten
												System.out.println(btnSelected.getText());
												btnSelected.setVisible(false); //set the selected button as invisible
												lblMessage.setText("Open 3 briefcase(s)!"); // set lblMessage as the following
												Alert alert5 = new Alert(AlertType.INFORMATION); //set alert
												alert5.setHeaderText(null);
												alert5.setContentText("Case # 9 contains" + " $" + btnSelected.getText()+ "!"); //set the case #9 as selected button text
												alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
												alert5.setTitle("Alert Example"); //set title
												alert5.showAndWait();

											}
											count2++;
										}									
										}
								for (int cols = 0; cols < ivAmounts[0].length; cols++)
								{
									for (int rows = 0; rows < ivAmounts.length; rows++)
									{
										if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
										{
											ivAmounts[rows][cols].setVisible(false); //set as invisible
										}
									}
								}
								}
								//if eleventh case is selected then do the following

					 		 if(numCases == 11)
								{
									for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
									{
										for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
										{
											if(btnSelected.getId().equals(suitcases[count2]))
											{
												eleven = Double.valueOf(btnSelected.getText()); //get the selected btn text and store in eleven
												System.out.println(btnSelected.getText());
												btnSelected.setVisible(false);  //set the selected button as invisible
												lblMessage.setText("Open 2 briefcase(s)!"); // set lblMessage as the following
												Alert alert5 = new Alert(AlertType.INFORMATION); //set alert
												alert5.setHeaderText(null);
												alert5.setContentText("Case # 10 contains" + " $" + btnSelected.getText()+ "!"); //set the case #10 as selected button text
												alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
												alert5.setTitle("Alert Example"); //set title
												alert5.showAndWait();

											}
											count2++;
										}									
										}
								for (int cols = 0; cols < ivAmounts[0].length; cols++)
								{
									for (int rows = 0; rows < ivAmounts.length; rows++)
									{
										if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
										{
											ivAmounts[rows][cols].setVisible(false); //set as invisible
										}
									}
									}
									}
								//if twelfth case is selected then do the following

					 		 if(numCases == 12)
								{
									for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
									{
										for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
										{
											if(btnSelected.getId().equals(suitcases[count2]))
											{
												twelve = Double.valueOf(btnSelected.getText());  //get the selected btn text and store in twelve
												System.out.println(btnSelected.getText());
												btnSelected.setVisible(false); //set the selected button as invisible
												lblMessage.setText("Open 1 briefcase(s)!"); // set lblMessage as the following
												Alert alert5 = new Alert(AlertType.INFORMATION); //set alert
												alert5.setHeaderText(null);
												alert5.setContentText("Case # 11 contains" + " $" + btnSelected.getText()+ "!"); //set the case #11 as selected button text
												alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
												alert5.setTitle("Alert Example"); //set title
												alert5.showAndWait();

											}
											count2++;
										}									
										}
								for (int cols = 0; cols < ivAmounts[0].length; cols++)
								{
									for (int rows = 0; rows < ivAmounts.length; rows++)
									{
										if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
										{
											//set thirteen as a double and store the (total - selected cases)
											double thirteen = Global.remainingTotal - (one + two + three + four + five + six + eight + nine + ten + eleven + twelve);
											ivAmounts[rows][cols].setVisible(false); //set ivAmounts as invisible
											  double bankOffer = (thirteen/26.0)*(2/10.0); // declare bankOffer as double 
							                  bankOffer = (((int)(bankOffer*100))/100.00);
							                  Alert alert = new Alert(AlertType.CONFIRMATION);  //declare alert
							                  alert.setHeaderText(null);
							                  ButtonType bt9 = new ButtonType("DEAL"); // declare button "DEAL"
							                  ButtonType bt10 = new ButtonType("NO DEAL"); //declare button "NO DEAL"
							                  alert.getButtonTypes().clear();
							                  alert.getButtonTypes().addAll(bt9, bt10); //ADD BUTTONS TO ALERT
							                //SET CONTENT TEXT TO SAY bankOffer
							                  alert.setContentText("The banker's offer is" + " $" + bankOffer + "\nDeal or no deal?");
							                  alert.setTitle("Banker's offer"); //set title
							                  Optional<ButtonType> result = alert.showAndWait();
							                  if (result.get() == bt9) // if users click DEAL 
							                  {
							                	  Alert alert2 = new Alert(AlertType.INFORMATION); //set alert
							                	  alert2.setHeaderText(null);
							                	  //SET CONTENT OF TEXT
							                	  alert2.setContentText("Congratulations...you're going home with $" + bankOffer + "!");
							                	//set image of alert
							                	  alert2.setGraphic(new ImageView(new Image("file:images/moneybag.png")));
							                	  alert2.setTitle("It's a deal!"); // set title
							                	  Optional<ButtonType> result2 = alert2.showAndWait();

							                  // Enter code here if the user selects ok
							                  if (result2.get() == ButtonType.OK)
							                  {
							                	  Alert alert3 = new Alert(AlertType.INFORMATION);// set alert
												alert3.setHeaderText(null);
												//set content text of alert to say the original case ivPlayerCase
													alert3.setContentText("You could have gone home with $" + first + "!");
													// set graphic
													alert3.setGraphic(new ImageView(images3));
												alert3.setTitle("Deal or No Deal"); //set title
												Optional<ButtonType> result3 = alert3.showAndWait();
							                  
							                  if (result3.get() == ButtonType.OK) // if users click OK
							                  {
							                	  Alert alert4 = new Alert(AlertType.INFORMATION);//SET ALERT
												alert4.setHeaderText(null);
												//set content text
													alert4.setContentText("Thank you for playing Deal or No Deal!");
													//set graphic
													alert4.setGraphic(new ImageView(new Image("file:images/dond_icon.png")));
												alert4.setTitle("Game over"); //set title
												alert4.showAndWait();
												System.exit(0);//exit program
							                  if (result.get() == bt10) // if users click NO DEAL
							                  {
							      				event.consume();//do nothing resume program 
							                  }
										}
									}
								}
										}
									}
									}
									}
					 		//if thirteenth case is selected then do the following
					 		 if(numCases == 13)
								{
									for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
									{
										for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
										{
											if(btnSelected.getId().equals(suitcases[count2]))
											{
												fourteen = Double.valueOf(btnSelected.getText());//get the selected btn text and store in fourteenth
												System.out.println(btnSelected.getText());
												btnSelected.setVisible(false); //set the selected button as invisible
												lblMessage.setText("Open 4 briefcase(s)!");// set lblMessage as the following
												Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
												alert5.setHeaderText(null);
												alert5.setContentText("Case # 12 contains" + " $" + btnSelected.getText()+ "!"); //set the case #12 as selected button text
												alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
												alert5.setTitle("Alert Example");//set title
												alert5.showAndWait();

											}
											count2++;
										}									
										}
								for (int cols = 0; cols < ivAmounts[0].length; cols++)
								{
									for (int rows = 0; rows < ivAmounts.length; rows++)
									{
										if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
										{
											ivAmounts[rows][cols].setVisible(false);//set as invisible
										}
									}
									}
									}
					 		//if fourteenth case is selected then do the following
		 		 if(numCases == 14)
					{
						for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
						{
							for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
							{
								if(btnSelected.getId().equals(suitcases[count2]))
								{
									fifteen = Double.valueOf(btnSelected.getText());//get the selected btn text and store in fifteen
									System.out.println(btnSelected.getText());
									btnSelected.setVisible(false); //set the selected button as invisible
									lblMessage.setText("Open 3 briefcase(s)!"); // set lblMessage as the following
									Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
									alert5.setHeaderText(null);
									alert5.setContentText("Case # 13 contains" + " $" + btnSelected.getText()+ "!"); //set the case #13 as selected button text
									alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
									alert5.setTitle("Alert Example"); //set title
									alert5.showAndWait();

								}
								count2++;
							}									
							}
					for (int cols = 0; cols < ivAmounts[0].length; cols++)
					{
						for (int rows = 0; rows < ivAmounts.length; rows++)
						{
							if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
							{
								ivAmounts[rows][cols].setVisible(false);//set as invisible
							}
						}
						}
						}
		 		//if fifteenth case is selected then do the following
		 		 if(numCases == 15)
					{
						for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
						{
							for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
							{
								if(btnSelected.getId().equals(suitcases[count2]))
								{
									sixteen = Double.valueOf(btnSelected.getText()); //get the selected btn text and store in sixteen
									System.out.println(btnSelected.getText());
									btnSelected.setVisible(false); //set the selected button as invisible
									lblMessage.setText("Open 2 briefcase(s)!"); // set lblMessage as the following
									Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
									alert5.setHeaderText(null);
									alert5.setContentText("Case # 14 contains" + " $" + btnSelected.getText()+ "!"); //set the case #14 as selected button text
									alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
									alert5.setTitle("Alert Example");//set title
									alert5.showAndWait();

								}
								count2++;
							}									
							}
					for (int cols = 0; cols < ivAmounts[0].length; cols++)
					{
						for (int rows = 0; rows < ivAmounts.length; rows++)
						{
							if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
							{
								ivAmounts[rows][cols].setVisible(false);//set as invisible
							}
						}
					}
					}
		 		 if(numCases == 16)
					{
						for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
						{
							for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
							{
								if(btnSelected.getId().equals(suitcases[count2]))
								{
									seventeen = Double.valueOf(btnSelected.getText()); //get the selected btn text and store in seventeen
									System.out.println(btnSelected.getText());
									btnSelected.setVisible(false); //set the selected button as invisible
									lblMessage.setText("Open 1 briefcase(s)!"); // set lblMessage as the following
									Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
									alert5.setHeaderText(null);
									//set the case #15 as selected button text
									alert5.setContentText("Case # 15 contains" + " $" + btnSelected.getText()+ "!");
									alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
									alert5.setTitle("Alert Example");//set title
									alert5.showAndWait();

								}
								count2++;
							}									
							}
					for (int cols = 0; cols < ivAmounts[0].length; cols++)
					{
						for (int rows = 0; rows < ivAmounts.length; rows++)
						{
							if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
							{
								//set eighteen as a double and store the (total - selected cases)
								double eighteen = Global.remainingTotal - (one + two + three + four + five + six + eight + nine + ten + eleven + twelve + fourteen + fifteen + sixteen + seventeen);
								ivAmounts[rows][cols].setVisible(false);  //set ivAmounts as invisible
								double bankOffer = (eighteen/26.0)*(3/10.0); // declare bankOffer as double 
				                  bankOffer = (((int)(bankOffer*100))/100.00);
				                  Alert alert = new Alert(AlertType.CONFIRMATION);//declare alert
				                  alert.setHeaderText(null);
				                  ButtonType bt9 = new ButtonType("DEAL"); // declare button "DEAL"
				                  ButtonType bt10 = new ButtonType("NO DEAL");//declare button "NO DEAL"
				                  alert.getButtonTypes().clear();
				                  alert.getButtonTypes().addAll(bt9, bt10); //ADD BUTTONS TO ALERT
				                  //SET CONTENT TEXT TO SAY bankOffer
				                  alert.setContentText("The banker's offer is" + " $" + bankOffer + "\nDeal or no deal?");
				                  alert.setTitle("Banker's offer"); //set title
				                  Optional<ButtonType> result = alert.showAndWait();
				                  if (result.get() == bt9)  // if users click DEAL 
				                  {
				                	  Alert alert2 = new Alert(AlertType.INFORMATION);//set alert
				                	  alert2.setHeaderText(null);
				                	//SET CONTENT OF TEXT
				                	  alert2.setContentText("Congratulations...you're going home with $" + bankOffer + "!");
				                	//set image of alert
				                	  alert2.setGraphic(new ImageView(new Image("file:images/moneybag.png")));
				                	  alert2.setTitle("It's a deal!"); // set title
				                	  Optional<ButtonType> result2 = alert2.showAndWait();

				                	// Enter code here if the user selects ok
				                  if (result2.get() == ButtonType.OK)
				                  {
				                	  Alert alert3 = new Alert(AlertType.INFORMATION);// set alert
									alert3.setHeaderText(null);
									//set content text of alert to say the original case ivPlayerCase
										alert3.setContentText("You could have gone home with $" + first + "!");
										// set graphic
										alert3.setGraphic(new ImageView(images3));//set title
									alert3.setTitle("Deal or No Deal");
									Optional<ButtonType> result3 = alert3.showAndWait();
									// if users click OK
				                  if (result3.get() == ButtonType.OK)
				                  {
				                	  Alert alert4 = new Alert(AlertType.INFORMATION);//SET ALERT
									alert4.setHeaderText(null);
									//set content text
										alert4.setContentText("Thank you for playing Deal or No Deal!");
										//set graphic
										alert4.setGraphic(new ImageView(new Image("file:images/dond_icon.png")));
									alert4.setTitle("Game over");//set title
									alert4.showAndWait();
									System.exit(0);//exit program
				                  if (result.get() == bt10)// if users click NO DEAL
				                  {
				      				event.consume();//do nothing resume program 
				                  }
							}
						}
					}
							}
						}
						}
						}
		 		//if seventeenth case is selected then do the following
				                  if(numCases == 17)
									{
										for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
										{
											for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
											{
												if(btnSelected.getId().equals(suitcases[count2]))
												{
													nineteen = Double.valueOf(btnSelected.getText());//get the selected btn text and store in nineteen
													System.out.println(btnSelected.getText());
													btnSelected.setVisible(false);//set the selected button as invisible
													lblMessage.setText("Open 3 briefcase(s)!");// set lblMessage as the following
													Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
													alert5.setHeaderText(null);
													alert5.setContentText("Case # 16 contains" + " $" + btnSelected.getText()+ "!");//set the case #16 as selected button text
													alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
													alert5.setTitle("Alert Example");//set title
													alert5.showAndWait();

												}
												count2++;
											}									
											}
									for (int cols = 0; cols < ivAmounts[0].length; cols++)
									{
										for (int rows = 0; rows < ivAmounts.length; rows++)
										{
											if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
											{
												ivAmounts[rows][cols].setVisible(false);//set as invisible
											}
										}
										}
										}
				  		 		//if eighteenth case is selected then do the following
			 		 if(numCases == 18)
						{
							for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
							{
								for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
								{
									if(btnSelected.getId().equals(suitcases[count2]))
									{
										twenty = Double.valueOf(btnSelected.getText());//get the selected btn text and store in twenty
										System.out.println(btnSelected.getText());
										btnSelected.setVisible(false);//set the selected button as invisible
										lblMessage.setText("Open 2 briefcase(s)!"); // set lblMessage as the following
										Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
										alert5.setHeaderText(null);
										alert5.setContentText("Case # 17 contains" + " $" + btnSelected.getText()+ "!"); //set the case #17 as selected button text
										alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
										alert5.setTitle("Alert Example"); //set title
										alert5.showAndWait();

									}
									count2++;
								}									
								}
						for (int cols = 0; cols < ivAmounts[0].length; cols++)
						{
							for (int rows = 0; rows < ivAmounts.length; rows++)
							{
								if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
								{
									ivAmounts[rows][cols].setVisible(false);//set as invisible
								}
							}
							}
							}
		  		 		//if nineteenth case is selected then do the following

			 		 if(numCases == 19)
						{
							for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
							{
								for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
								{
									if(btnSelected.getId().equals(suitcases[count2]))
									{
										twentyone = Double.valueOf(btnSelected.getText());//get the selected btn text and store in twentyone
										System.out.println(btnSelected.getText());
										btnSelected.setVisible(false); //set the selected button as invisible
										lblMessage.setText("Open 1 briefcase(s)!"); // set lblMessage as the following
										Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
										alert5.setHeaderText(null);
										alert5.setContentText("Case # 18 contains" + " $" + btnSelected.getText()+ "!");//set the case #18 as selected button text
										alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
										alert5.setTitle("Alert Example");//set title
										alert5.showAndWait();

									}
									count2++;
								}									
								}
						for (int cols = 0; cols < ivAmounts[0].length; cols++)
						{
							for (int rows = 0; rows < ivAmounts.length; rows++)
							{
								if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
								{
									//set twentytwo as a double and store the (total - selected cases)
									double twentytwo = Global.remainingTotal - (one + two + three + four + five + six + eight + nine + ten + eleven + twelve + fourteen + fifteen + sixteen + seventeen + nineteen + twenty + twentyone);
									ivAmounts[rows][cols].setVisible(false); //set ivAmounts as invisible
								    double bankOffer = (twentytwo/26.0)*(4/10.0); // declare bankOffer as double 
					                  bankOffer = (((int)(bankOffer*100))/100.00);
					                  Alert alert = new Alert(AlertType.CONFIRMATION);//declare alert
					                  alert.setHeaderText(null);
					                  ButtonType bt9 = new ButtonType("DEAL");// declare button "DEAL"
					                  ButtonType bt10 = new ButtonType("NO DEAL");//declare button "NO DEAL"
					                  alert.getButtonTypes().clear();
					                  alert.getButtonTypes().addAll(bt9, bt10);//ADD BUTTONS TO ALERT
					                //SET CONTENT TEXT TO SAY bankOffer
					                  alert.setContentText("The banker's offer is" + " $" + bankOffer + "\nDeal or no deal?");
					                  alert.setTitle("Banker's offer");//set title
					                  Optional<ButtonType> result = alert.showAndWait();
					                  if (result.get() == bt9)// if users click DEAL 
					                  {
					                	  Alert alert2 = new Alert(AlertType.INFORMATION);//set alert
					                	  alert2.setHeaderText(null);
					                	//SET CONTENT OF TEXT
					                	  alert2.setContentText("Congratulations...you're going home with $" + bankOffer + "!");
					                	//set image of alert
					                	  alert2.setGraphic(new ImageView(new Image("file:images/moneybag.png")));
					                	  alert2.setTitle("It's a deal!");// set title
					                	  Optional<ButtonType> result2 = alert2.showAndWait();

					                	// Enter code here if the user selects ok
					                  if (result2.get() == ButtonType.OK)
					                  {
					                	  Alert alert3 = new Alert(AlertType.INFORMATION);// set alert
										alert3.setHeaderText(null);
										//set content text of alert to say the original case ivPlayerCase
											alert3.setContentText("You could have gone home with $" + first + "!");
											// set graphic
											alert3.setGraphic(new ImageView(images3)); //set title
										alert3.setTitle("Deal or No Deal");
										Optional<ButtonType> result3 = alert3.showAndWait();
										// if users click OK
					                  if (result3.get() == ButtonType.OK)
					                  {
					                	  Alert alert4 = new Alert(AlertType.INFORMATION);//SET ALERT
										alert4.setHeaderText(null);
										//set content text
											alert4.setContentText("Thank you for playing Deal or No Deal!");
											//set graphic
											alert4.setGraphic(new ImageView(new Image("file:images/dond_icon.png")));
										alert4.setTitle("Game over");//set title
										alert4.showAndWait();
										System.exit(0);//exit program
					                  if (result.get() == bt10)// if users click NO DEAL
					                  {
					      				event.consume();//do nothing resume program 
					                  }
								}
							}
						}
							}
						}
						}
						}
		  		 		//if 20th case is selected then do the following

			 		 if(numCases == 20)
						{
							for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
							{
								for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
								{
									if(btnSelected.getId().equals(suitcases[count2]))
									{
										twentythree = Double.valueOf(btnSelected.getText());//get the selected btn text and store in twenthythree
										System.out.println(btnSelected.getText());
										btnSelected.setVisible(false);//set the selected button as invisible
										lblMessage.setText("Open 2 briefcase(s)!");// set lblMessage as the following
										Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
										alert5.setHeaderText(null);
										alert5.setContentText("Case # 19 contains" + " $" + btnSelected.getText()+ "!");//set the case #19 as selected button text
										alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
										alert5.setTitle("Alert Example");//set title
										alert5.showAndWait();

									}
									count2++;
								}									
								}
						for (int cols = 0; cols < ivAmounts[0].length; cols++)
						{
							for (int rows = 0; rows < ivAmounts.length; rows++)
							{
								if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
								{
									ivAmounts[rows][cols].setVisible(false); //set to invisible
								}
							}
							}
							}
			 		//if 21th case is selected then do the following	
		 if(numCases == 21)
			{
				for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
				{
					for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
					{
						if(btnSelected.getId().equals(suitcases[count2]))
						{
							twentyfour = Double.valueOf(btnSelected.getText());//get the selected btn text and store in twentyfour
							System.out.println(btnSelected.getText());
							btnSelected.setVisible(false);//set the selected button as invisible
							lblMessage.setText("Open 1 briefcase(s)!");// set lblMessage as the following
							Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
							alert5.setHeaderText(null);
							alert5.setContentText("Case # 20 contains" + " $" + btnSelected.getText()+ "!");//set the case #20 as selected button text
							alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
							alert5.setTitle("Alert Example");//set title
							alert5.showAndWait();

						}
						count2++;
					}									
					}
			for (int cols = 0; cols < ivAmounts[0].length; cols++)
			{
				for (int rows = 0; rows < ivAmounts.length; rows++)
				{
					if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
					{
						//set twentyfive as a double and store the (total - selected cases)
						double twentyfive = Global.remainingTotal - (one + two + three + four + five + six + eight + nine + ten + eleven + twelve + fourteen + fifteen + sixteen + seventeen + nineteen + twenty + twentyone + twentythree + twentyfour);
						ivAmounts[rows][cols].setVisible(false);//set ivAmounts as invisible
						double bankOffer = (twentyfive/26.0)*(5/10.0);// declare bankOffer as double 
		                  bankOffer = (((int)(bankOffer*100))/100.00);
		                  Alert alert = new Alert(AlertType.CONFIRMATION);//declare alert
		                  alert.setHeaderText(null);
		                  ButtonType bt9 = new ButtonType("DEAL"); // declare button "DEAL"
		                  ButtonType bt10 = new ButtonType("NO DEAL");//declare button "NO DEAL"
		                  alert.getButtonTypes().clear();
		                  alert.getButtonTypes().addAll(bt9, bt10);//ADD BUTTONS TO ALERT
		                  //SET CONTENT TEXT TO SAY bankOffer
		                  alert.setContentText("The banker's offer is" + " $" + bankOffer + "\nDeal or no deal?");
		                  alert.setTitle("Banker's offer");//set title
		                  Optional<ButtonType> result = alert.showAndWait();
		                  if (result.get() == bt9)  // if users click DEAL 
		                  {
		                	  Alert alert2 = new Alert(AlertType.INFORMATION);
		                	  alert2.setHeaderText(null);
		                	//SET CONTENT OF TEXT
		                	  alert2.setContentText("Congratulations...you're going home with $" + bankOffer + "!");
		                	//set image of alert
		                	  alert2.setGraphic(new ImageView(new Image("file:images/moneybag.png")));
		                	  alert2.setTitle("It's a deal!");// set title
		                	  Optional<ButtonType> result2 = alert2.showAndWait();

		                	// Enter code here if the user selects ok
		                  if (result2.get() == ButtonType.OK)
		                  {
		                	  Alert alert3 = new Alert(AlertType.INFORMATION); // set alert
							alert3.setHeaderText(null);
							//set content text of alert to say the original case ivPlayerCase
							alert3.setContentText("You could have gone home with $" + first + "!");
							// set graphic
							alert3.setGraphic(new ImageView(images3));
							alert3.setTitle("Deal or No Deal"); //set title of alert
							Optional<ButtonType> result3 = alert3.showAndWait();
							// if users click OK
		                  if (result3.get() == ButtonType.OK)
		                  {
		                	  Alert alert4 = new Alert(AlertType.INFORMATION);//SET ALERT
							alert4.setHeaderText(null);//set content text
								alert4.setContentText("Thank you for playing Deal or No Deal!");
								//set graphic
								alert4.setGraphic(new ImageView(new Image("file:images/dond_icon.png")));
							alert4.setTitle("Game over");//set title
							alert4.showAndWait();
							System.exit(0);//exit program
		                  if (result.get() == bt10)// if users click NO DEAL
		                  {
		      				event.consume();//do nothing resume program 
		                  }
					}
				}
			}
					}
				}
				}
				}
	 		//if 22nd case is selected then do the following	

		  if(numCases == 22)
			{
				for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
				{
					for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
					{
						if(btnSelected.getId().equals(suitcases[count2]))
						{
							twentysix = Double.valueOf(btnSelected.getText());//get the selected btn text and store in twentysix
							System.out.println(btnSelected.getText());
							btnSelected.setVisible(false);//set the selected button as invisible
							lblMessage.setText("Open 4 briefcase(s)!");// set lblMessage as the following
							Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
							alert5.setHeaderText(null);
							alert5.setContentText("Case # 21 contains" + " $" + btnSelected.getText()+ "!"); //set the case #21 as selected button text
							alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
							alert5.setTitle("Alert Example");//set title
							alert5.showAndWait();

						}
						count2++;
					}									
					}
			for (int cols = 0; cols < ivAmounts[0].length; cols++)
			{
				for (int rows = 0; rows < ivAmounts.length; rows++)
				{
					if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
					{
						//set offer as a double and store the (total - selected cases)
						double offer = Global.remainingTotal - (one + two + three + four + five + six + eight + nine + ten + eleven + twelve + fourteen + fifteen + sixteen + seventeen + nineteen + twenty + twentyone + twentythree + twentyfour + twentysix);
						ivAmounts[rows][cols].setVisible(false); //set ivAmounts as invisible
					    double bankOffer = (offer/26.0)*(6/10.0);// declare bankOffer as double 
		                  bankOffer = (((int)(bankOffer*100))/100.00);
		                  Alert alert = new Alert(AlertType.CONFIRMATION);//declare alert
		                  alert.setHeaderText(null);
		                  ButtonType bt9 = new ButtonType("DEAL");// declare button "DEAL"
		                  ButtonType bt10 = new ButtonType("NO DEAL");//declare button "NO DEAL"
		                  alert.getButtonTypes().clear();
		                  alert.getButtonTypes().addAll(bt9, bt10); //ADD BUTTONS TO ALERT
		                  //SET CONTENT TEXT TO SAY bankOffer
		                  alert.setContentText("The banker's offer is" + " $" + bankOffer + "\nDeal or no deal?");
		                  alert.setTitle("Banker's offer");//set title
		                  Optional<ButtonType> result = alert.showAndWait();
		                  if (result.get() == bt9)// if users click DEAL 
		                  {
		                	  Alert alert2 = new Alert(AlertType.INFORMATION);//set alert
		                	  alert2.setHeaderText(null);
		                	//SET CONTENT OF TEXT
		                	  alert2.setContentText("Congratulations...you're going home with $" + bankOffer + "!");
		                	//set image of alert
		                	  alert2.setGraphic(new ImageView(new Image("file:images/moneybag.png")));
		                	  alert2.setTitle("It's a deal!");// set title
		                	  Optional<ButtonType> result2 = alert2.showAndWait();

		                	// Enter code here if the user selects ok
		                  if (result2.get() == ButtonType.OK)
		                  {
		                	  Alert alert3 = new Alert(AlertType.INFORMATION);// set alert
							alert3.setHeaderText(null);
							//set content text of alert to say the original case ivPlayerCase
								alert3.setContentText("You could have gone home with $" + first + "!");
								// set graphic
								alert3.setGraphic(new ImageView(images3));//set title
							alert3.setTitle("Deal or No Deal");
							Optional<ButtonType> result3 = alert3.showAndWait();
							// if users click OK
		                  if (result3.get() == ButtonType.OK)
		                  {
		                	  Alert alert4 = new Alert(AlertType.INFORMATION);//SET ALERT
							alert4.setHeaderText(null);
							//set content text
								alert4.setContentText("Thank you for playing Deal or No Deal!");
								//set graphic
							alert4.setGraphic(new ImageView(new Image("file:images/dond_icon.png")));
							alert4.setTitle("Game over");//set title
							alert4.showAndWait();
							System.exit(0);//exit program
		                  if (result.get() == bt10)// if users click NO DEAL
		                  {
		      				event.consume();//do nothing resume program 
		                  }
					}
				}
			}
					}
				}
				}
				}
	 		//if 23rd case is selected then do the following		
if(numCases == 23)
{
	for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
	{
		for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
		{
			if(btnSelected.getId().equals(suitcases[count2]))
			{
				//get the selected btn text and store in twentyseven
				twentyseven = Double.valueOf(btnSelected.getText());
				System.out.println(btnSelected.getText());
				btnSelected.setVisible(false);//set the selected button as invisible
				lblMessage.setText("Open 3 briefcase(s)!");// set lblMessage as the following
				Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
				alert5.setHeaderText(null);
				//set the case #22 as selected button text
				alert5.setContentText("Case # 22 contains" + " $" + btnSelected.getText()+ "!");
				alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
				alert5.setTitle("Alert Example");//set title
				alert5.showAndWait();

			}
			count2++;
		}									
		}
for (int cols = 0; cols < ivAmounts[0].length; cols++)
{
	for (int rows = 0; rows < ivAmounts.length; rows++)
	{
		if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
		{
			//set offer1 as a double and store the (total - selected cases)
			double offer1 = Global.remainingTotal - (one + two + three + four + five + six + eight + nine + ten + eleven + twelve + fourteen + fifteen + sixteen + seventeen + nineteen + twenty + twentyone + twentythree + twentyfour + twentysix + twentyseven);
			ivAmounts[rows][cols].setVisible(false); //set ivAmounts as invisible
			double bankOffer = (offer1/26.0)*(7/10.0); // declare bankOffer as double 
            bankOffer = (((int)(bankOffer*100))/100.00);
            Alert alert = new Alert(AlertType.CONFIRMATION);//declare alert
            alert.setHeaderText(null);
            ButtonType bt9 = new ButtonType("DEAL");// declare button "DEAL"
            ButtonType bt10 = new ButtonType("NO DEAL");//declare button "NO DEAL"
            alert.getButtonTypes().clear();
            alert.getButtonTypes().addAll(bt9, bt10);//ADD BUTTONS TO ALERT
            //SET CONTENT TEXT TO SAY bankOffer
            alert.setContentText("The banker's offer is" + " $" + bankOffer + "\nDeal or no deal?");
            alert.setTitle("Banker's offer");//set title
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == bt9) // if users click DEAL 
            {
          	  Alert alert2 = new Alert(AlertType.INFORMATION);//set alert
          	  alert2.setHeaderText(null);
          	//SET CONTENT OF TEXT
          	  alert2.setContentText("Congratulations...you're going home with $" + bankOffer + "!");
          	//set image of alert
          	  alert2.setGraphic(new ImageView(new Image("file:images/moneybag.png")));
          	  alert2.setTitle("It's a deal!");// set title
          	  Optional<ButtonType> result2 = alert2.showAndWait();

          	// Enter code here if the user selects ok
            if (result2.get() == ButtonType.OK)
            {
          	  Alert alert3 = new Alert(AlertType.INFORMATION);// set alert
				alert3.setHeaderText(null);
				//set content text of alert to say the original case ivPlayerCase
					alert3.setContentText("You could have gone home with $" + first + "!");
					// set graphic
					alert3.setGraphic(new ImageView(images3));//set title
				alert3.setTitle("Deal or No Deal");
				Optional<ButtonType> result3 = alert3.showAndWait();
				// if users click OK
            if (result3.get() == ButtonType.OK)
            {
          	  Alert alert4 = new Alert(AlertType.INFORMATION);//SET ALERT
				alert4.setHeaderText(null);
				//set content text
					alert4.setContentText("Thank you for playing Deal or No Deal!");
					//set graphic
					alert4.setGraphic(new ImageView(new Image("file:images/dond_icon.png")));
				alert4.setTitle("Game over");//set title
				alert4.showAndWait();
				System.exit(0);//exit program
            if (result.get() == bt10)// if users click NO DEAL
            {
				event.consume();//do nothing resume program 
            }
		}
	}
}
		}
	}
	}
	}
//if 24th case is selected then do the following	
if(numCases == 24)
{
	for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
	{
		for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
		{
			if(btnSelected.getId().equals(suitcases[count2]))
			{
				//get the selected btn text and store in twentyeight
				twentyeight = Double.valueOf(btnSelected.getText());
				System.out.println(btnSelected.getText());
				btnSelected.setVisible(false);//set the selected button as invisible
				lblMessage.setText("Open 2 briefcase(s)!");// set lblMessage as the following
				Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
				alert5.setHeaderText(null);
				//set the case #23 as selected button text
				alert5.setContentText("Case # 23 contains" + " $" + btnSelected.getText()+ "!");
				alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
				alert5.setTitle("Alert Example");//set title
				alert5.showAndWait();

			}
			count2++;
		}									
		}
for (int cols = 0; cols < ivAmounts[0].length; cols++)
{
	for (int rows = 0; rows < ivAmounts.length; rows++)
	{
		if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
		{
			//set offer2 as a double and store the (total - selected cases)
			double offer2 = Global.remainingTotal - (one + two + three + four + five + six + eight + nine + ten + eleven + twelve + fourteen + fifteen + sixteen + seventeen + nineteen + twenty + twentyone + twentythree + twentyfour + twentysix + twentyseven + twentyeight);
			ivAmounts[rows][cols].setVisible(false);//set ivAmounts as invisible
			double bankOffer = (offer2/26.0)*(8/10.0); // declare bankOffer as double 
            bankOffer = (((int)(bankOffer*100))/100.00);
            Alert alert = new Alert(AlertType.CONFIRMATION);//declare alert
            alert.setHeaderText(null);
            ButtonType bt9 = new ButtonType("DEAL");// declare button "DEAL"
            ButtonType bt10 = new ButtonType("NO DEAL");//declare button "NO DEAL"
            alert.getButtonTypes().clear();
            alert.getButtonTypes().addAll(bt9, bt10);//ADD BUTTONS TO ALERT
          //SET CONTENT TEXT TO SAY bankOffer
            alert.setContentText("The banker's offer is" + " $" + bankOffer + "\nDeal or no deal?");
            alert.setTitle("Banker's offer"); //set title
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == bt9) // if users click DEAL 
            {
          	  Alert alert2 = new Alert(AlertType.INFORMATION); //set alert
          	  alert2.setHeaderText(null);
          	//SET CONTENT OF TEXT
          	  alert2.setContentText("Congratulations...you're going home with $" + bankOffer + "!");
          	//set image of alert
          	  alert2.setGraphic(new ImageView(new Image("file:images/moneybag.png")));
          	  alert2.setTitle("It's a deal!");// set title
          	  Optional<ButtonType> result2 = alert2.showAndWait();

          	// Enter code here if the user selects ok
            if (result2.get() == ButtonType.OK)
            {
          	  Alert alert3 = new Alert(AlertType.INFORMATION);// set alert
				alert3.setHeaderText(null);
				//set content text of alert to say the original case ivPlayerCase
					alert3.setContentText("You could have gone home with $" + first + "!");
					// set graphic
					alert3.setGraphic(new ImageView(images3));
				alert3.setTitle("Deal or No Deal");
				Optional<ButtonType> result3 = alert3.showAndWait();
				// if users click OK
            if (result3.get() == ButtonType.OK)
            {
            	//SET ALERT
          	  Alert alert4 = new Alert(AlertType.INFORMATION);
				alert4.setHeaderText(null);
				//set content text
					alert4.setContentText("Thank you for playing Deal or No Deal!");
					//set graphic
					alert4.setGraphic(new ImageView(new Image("file:images/dond_icon.png")));
				alert4.setTitle("Game over");//set title
				alert4.showAndWait();
				System.exit(0);//exit program
            if (result.get() == bt10)
            {
				event.consume();//do nothing resume program 
            }
		}
	}
}
		}
	}
	}
	}
//if 25th case is selected then do the following
if(numCases == 25)
{
	for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
	{
		for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++) 
		{
			if(btnSelected.getId().equals(suitcases[count2]))
			{
				//get the selected btn text and store in twentynine
				twentynine = Double.valueOf(btnSelected.getText());
				System.out.println(btnSelected.getText());
				btnSelected.setVisible(false);//set the selected button as invisible
				lblMessage.setText("Open 1 briefcase(s)!"); // set lblMessage as the following
				Alert alert5 = new Alert(AlertType.INFORMATION);//set alert
				alert5.setHeaderText(null);
				//set the case #24 as selected button text
				alert5.setContentText("Case # 24 contains" + " $" + btnSelected.getText()+ "!");
				alert5.setGraphic(new ImageView(new Image("file:images/suitcases/" + suitcases[count2] + ".png")));
				alert5.setTitle("Alert Example");//set title
				alert5.showAndWait();

			}
			count2++;
		}									
		}
for (int cols = 0; cols < ivAmounts[0].length; cols++)
{
	for (int rows = 0; rows < ivAmounts.length; rows++)
	{
		if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
		{
			//set offer3 as a double and store the (total - selected cases)
			double offer3 = Global.remainingTotal - (one + two + three + four + five + six + eight + nine + ten + eleven + twelve + fourteen + fifteen + sixteen + seventeen + nineteen + twenty + twentyone + twentythree + twentyfour + twentysix + twentyseven + twentyeight + twentynine);
			ivAmounts[rows][cols].setVisible(false);//set ivAmounts as invisible
            double bankOffer = (offer3/26.0)*(9/10.0);// declare bankOffer as double 
            bankOffer = (((int)(bankOffer*100))/100.00);
            Alert alert = new Alert(AlertType.CONFIRMATION);//declare alert
            alert.setHeaderText(null);
            ButtonType bt9 = new ButtonType("DEAL");// declare button "DEAL"
            ButtonType bt10 = new ButtonType("NO DEAL");//declare button "NO DEAL"
            alert.getButtonTypes().clear();
            alert.getButtonTypes().addAll(bt9, bt10); //ADD BUTTONS TO ALERT
            //SET CONTENT TEXT TO SAY bankOffer
            alert.setContentText("The banker's offer is" + " $" + bankOffer + "\nDeal or no deal?");
            alert.setTitle("Banker's offer"); //set title
            Optional<ButtonType> result = alert.showAndWait();
            if (result.get() == bt9) // if users click DEAL 
            {
          	  Alert alert2 = new Alert(AlertType.INFORMATION); //set alert
          	  alert2.setHeaderText(null);
          	//SET CONTENT OF TEXT
          	  alert2.setContentText("Congratulations...you're going home with $" + bankOffer + "!");
          	//set image of alert
          	  alert2.setGraphic(new ImageView(new Image("file:images/moneybag.png")));
          	  alert2.setTitle("It's a deal!");// set title
          	  Optional<ButtonType> result2 = alert2.showAndWait();

          	// Enter code here if the user selects ok
            if (result2.get() == ButtonType.OK)
            {
          	  Alert alert3 = new Alert(AlertType.INFORMATION); // set alert
				alert3.setHeaderText(null);
				//set content text of alert to say the original case ivPlayerCase
					alert3.setContentText("You could have gone home with $" + first + "!");
					// set graphic
					alert3.setGraphic(new ImageView(images3));
				alert3.setTitle("Deal or No Deal");
				Optional<ButtonType> result3 = alert3.showAndWait();
				// if users click OK
            if (result3.get() == ButtonType.OK)
            {
          	  Alert alert4 = new Alert(AlertType.INFORMATION);//SET ALERT
				alert4.setHeaderText(null);
				//set content text
					alert4.setContentText("Thank you for playing Deal or No Deal!");
					//set graphic
					alert4.setGraphic(new ImageView(new Image("file:images/dond_icon.png")));
				alert4.setTitle("Game over");//set title
				alert4.showAndWait();
				System.exit(0);//exit program
            if (result.get() == bt10)
            {
				event.consume();//do nothing resume program 
            }
		}
	}
}
		}
	}
	}
	}
//if 26th case is selected then do the following
if(numCases == 26)
{
for(int rows1 = 0; rows1 < buttonArray.length; rows1++)
{
for(int cols1 = 0; cols1 < buttonArray[rows1].length; cols1++)
{
if(btnSelected.getId().equals(suitcases[count2]))
{
	//get the selected btn text and store in fourty
	fourty = Double.valueOf(btnSelected.getText());
	btnSelected.setVisible(false); //set the selected button as invisible
	//save image of case 26 as images4
	images4 = new Image("file:images/suitcases/" + suitcases[count2] + ".png");


}
count2++;
}
}
for (int cols = 0; cols < ivAmounts[0].length; cols++)
{
for (int rows = 0; rows < ivAmounts.length; rows++)
{
if(ivAmounts[rows][cols].getId().equals(btnSelected.getText()))
{
ivAmounts[rows][cols].setVisible(true);
Alert alert20 = new Alert(AlertType.INFORMATION);//set alert
alert20.setHeaderText(null);
//SET CONTENT TEXT 
alert20.setContentText("There is only one case left!" + "\n Would you like to keep your case?");
alert20.setTitle("Deal or No Deal"); //set title
alert20.getButtonTypes().clear();
alert20.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO); //add buttons yes and no to alert
Optional<ButtonType> result50 = alert20.showAndWait();
if (result50.get() == ButtonType.YES) // if user presses yes
{
	Alert alert6 = new Alert(AlertType.INFORMATION);//set alert
	alert6.setHeaderText(null);
	alert6.setGraphic(new ImageView(images4)); //set graphic to images4
	//set content text of alert to say the case picked
	alert6.setContentText("Congratulations...you're going home with $" + fourty + "!");
	alert6.setTitle("Deal or No Deal"); //set title
	Optional<ButtonType> result2 = alert6.showAndWait();
	if(result2.get() == ButtonType.OK) //if user presses ok
	{
		Alert alert7 = new Alert(AlertType.INFORMATION);//set alert
		alert7.setHeaderText(null);
		alert7.setContentText("Would you like to play again"); //set content text
		alert7.setTitle("Deal or No Deal"); //set title
		alert7.getButtonTypes().clear();
		alert7.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO); //add buttons yes and no to alert
		Optional<ButtonType> result15 = alert7.showAndWait();
		if(result15.get() == ButtonType.YES) // if user presses yes
		{
			//this basically restarts the applications
			primaryStage.close(); 
		      Platform.runLater( () -> new Main().start( new Stage() ) );
		      
			primaryStage.setScene( scene);
			primaryStage.show();
		}
		if(result15.get() == ButtonType.NO)
			{
			//exit application
				System.exit(0);
			
		}
	}
}
	if(result50.get() == ButtonType.NO) //if user presses no 
	{
		Alert alert10 = new Alert(AlertType.INFORMATION); //set alert
		alert10.setHeaderText(null);
		alert10.setGraphic(new ImageView(images3)); //set graphic
		//set content text of alert to say the original case ivPlayerCase
		alert10.setContentText("Congratulations...you're going home with $" + first + "!");
		alert10.setTitle("Deal or No Deal"); //set title
		Optional<ButtonType> result8 = alert10.showAndWait();
		if(result8.get() == ButtonType.OK) // if user presses ok 
		{
			Alert alert11 = new Alert(AlertType.INFORMATION);//set alert
			alert11.setHeaderText(null);
			alert11.setContentText("Would you like to play again"); //set content text
			alert11.setTitle("Deal or No Deal");// set title
			alert11.getButtonTypes().clear();
			alert11.getButtonTypes().addAll(ButtonType.YES, ButtonType.NO); //add buttons yes and no to alert
			Optional<ButtonType> result9 = alert11.showAndWait();
			if(result9.get() == ButtonType.YES) // if user presses yes
			{
				//this basically restarts the application
				primaryStage.close();
			      Platform.runLater( () -> new Main().start( new Stage() ) );
			      
				primaryStage.setScene( scene);
				primaryStage.show();
			}
				if(result9.get() == ButtonType.NO) //if user presses no
				{
					//end application
					System.exit(0);
			}
		}
	}
}
}
}
}
}
});
}
}

				
				lblMessage = new Label(); //declare lblMessage
				lblMessage.setPrefSize(692, 50); //set preffered size
				lblMessage.setAlignment(Pos.CENTER); //set Allignement
				lblMessage.setFont(Font.font("System", FontWeight.BOLD, 18)); //set font
				lblMessage.setTextFill(Color.rgb(252, 234, 151)); //set Text color
				lblMessage.setText("Choose one of the briefcases!"); //set the text
				
				StackPane southPanel = new StackPane(); //declare southPanel
				southPanel.setAlignment(Pos.CENTER_LEFT); //set allignement
				southPanel.setPadding(new Insets(10, 0, 0, 0)); //set padding
				StackPane.setMargin(ivPlayersCase, new Insets(0, 0, 20, 40)); //set margin
				southPanel.getChildren().addAll(lblMessage, ivPlayersCase); //add all to South Panel
			
	
				root = new BorderPane(); // declare root as BorderPane
				root.setPadding(new Insets(0, 0, 10, 0)); //set padding
				root.setStyle("-fx-background-color: black"); //set style
				
				BorderPane.setAlignment(ivTitle, Pos.CENTER); //set allignement
				BorderPane.setMargin(ivTitle, new Insets(10, 10, 10, 10)); //set margin
				root.setTop(ivTitle); //set ivTitle at the top
				root.setLeft(westPanel); //set westPanel at left
				root.setRight(eastPanel); //set eastPanel at right
	
	
	
				BorderPane.setAlignment(centerPanel, Pos.TOP_CENTER); //set allignement of centerPanel at BorderPane
				root.setCenter(centerPanel); //set centerPanel at center
				root.setBottom(southPanel); //set southPanel at bottom
				
				
			
	
				scene = new Scene(root); // declare scene as new Scene
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	
				primaryStage.setTitle("Deal or No Deal");//set title as Deal or No Deal
				primaryStage.setScene(scene);
	
				primaryStage.show();
			} 			
			catch(Exception e) {
				e.printStackTrace();
		}
	}
	}