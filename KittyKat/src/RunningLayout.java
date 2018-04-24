import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RunningLayout extends Application
{

	//Fields
	Scene questionpage, clickerpage, finalpage;
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage1) throws Exception 
	{
		
		
		//Layouts
			//Question Page
		
			VBox f1 = new VBox();
			f1.setPadding(new Insets(20));
			f1.setSpacing(100);
			
			
			Label qq = new Label("Insert text");
			Button sc1 = new Button("Button text");
			
		
		//Buttons
		
		
		

		
		//Scene Callouts
			f1.getChildren().add(qq);
			f1.getChildren().add(sc1);
			f1.setAlignment(Pos.CENTER);
			
			
			questionpage = new Scene(f1,800,800);
			
		//Scene Setters
		stage1.setScene(questionpage);
		stage1.show();
		stage1.setHeight(800);
		stage1.setWidth(800);
	
	

	
	}

}
