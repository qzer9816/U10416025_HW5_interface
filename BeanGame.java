//U10416025 張詠淳

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;
import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;

public class BeanGame extends Application {
    @Override
   	public void start(Stage primaryStage) {
   	//新增介面
		Pane pane = new Pane();
		Polyline polyline = new Polyline();
		pane.getChildren().add(polyline);
		//設定線連接的點
		ObservableList<Double> list = polyline.getPoints();
	
		list.add(90.0);
		list.add(35.0);

		list.add(90.0);
		list.add(65.0);

		list.add(0.0);
		list.add(200.0);

		list.add(40.0);
		list.add(200.0);
		list.add(40.0);
		list.add(165.0);
		list.add(40.0);
		list.add(200.0);

		list.add(60.0);
		list.add(200.0);
		list.add(60.0);
		list.add(165.0);
		list.add(60.0);
		list.add(200.0);

		list.add(80.0);
		list.add(200.0);
		list.add(80.0);
		list.add(165.0);
		list.add(80.0);
		list.add(200.0);

		list.add(100.0);
		list.add(200.0);
		list.add(100.0);
		list.add(165.0);
		list.add(100.0);
		list.add(200.0);

		list.add(120.0);
		list.add(200.0);
		list.add(120.0);
		list.add(165.0);
		list.add(120.0);
		list.add(200.0);

		list.add(140.0);
		list.add(200.0);
		list.add(140.0);
		list.add(165.0);
		list.add(140.0);
		list.add(200.0);

		list.add(160.0);
		list.add(200.0);
		list.add(160.0);
		list.add(165.0);
		list.add(160.0);
		list.add(200.0);

		list.add(200.0);
		list.add(200.0);

		list.add(110.0);
		list.add(65.0);

		list.add(110.0);
		list.add(35.0);
}
