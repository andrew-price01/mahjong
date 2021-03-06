import java.util.ArrayList;
@SuppressWarnings("serial")
public class Layer extends ArrayList<Row> {

	MahJongModel model = new MahJongModel();

	public Layer(ArrayList<Tile> deck) {
		Row row0 = new Row(1, 1);
		row0.addTiles(deck, 12);
		for (Tile t : row0) {
			model.positionTile(t, row0.x, row0.y, 0);
			t.setLocation((row0.x * 70 + t.z * 20), (row0.y * 70 + t.z * 20));
			row0.x += 1;
		}

		Row row1 = new Row(3, 2);
		row1.addTiles(deck, 8);
		for (Tile t : row1) {
			model.positionTile(t, row1.x, row1.y, 0);
			t.setLocation((row1.x * 70 + t.z * 20), (row1.y * 70 + t.z * 20));
			row1.x += 1;
		}

		Row row2 = new Row(2, 3);
		row2.addTiles(deck, 10);
		for (Tile t : row2) {
			model.positionTile(t, row2.x, row2.y, 0);
			t.setLocation((row2.x * 70 + t.z * 20), (row2.y * 70 + t.z * 20));
			row2.x += 1;
		}

		Row row3 = new Row(1, 4);
		row3.addTiles(deck, 12);
		for (Tile t : row3) {
			model.positionTile(t, row3.x, row3.y, 0);
			t.setLocation((row3.x * 70 + t.z * 20), (row3.y * 70 + t.z * 20));
			row3.x += 1;
		}

		Row row4 = new Row(1, 5);
		row4.addTiles(deck, 12);
		for (Tile t : row4) {
			model.positionTile(t, row4.x, row4.y, 0);
			t.setLocation((row4.x * 70 + t.z * 20), (row4.y * 70 + t.z * 20));
			row4.x += 1;
		}

		// ----------------Special--------------//
		Row special = new Row(13, 4);
		special.addTiles(deck, 2);
		for (Tile t : special) {
			model.positionTile(t, special.x, special.y, 0);
			t.setLocation((special.x * 70 + t.z * 20), (special.y * 70 + t.z * 20) + 30);
			special.x += 1;
		}

		Row row5 = new Row(2, 6);
		row5.addTiles(deck, 10);
		for (Tile t : row5) {
			model.positionTile(t, row5.x, row5.y, 0);
			t.setLocation((row5.x * 70 + t.z * 20), (row5.y * 70 + t.z * 20));
			row5.x += 1;
		}

		Row row6 = new Row(3, 7);
		row6.addTiles(deck, 8);
		for (Tile t : row6) {
			model.positionTile(t, row6.x, row6.y, 0);
			t.setLocation((row6.x * 70 + t.z * 20), (row6.y * 70 + t.z * 20));
			row6.x += 1;
		}

		Row row7 = new Row(1, 8);
		row7.addTiles(deck, 12);
		for (Tile t : row7) {
			model.positionTile(t, row7.x, row7.y, 0);
			t.setLocation((row7.x * 70 + t.z * 20), (row7.y * 70 + t.z * 20));
			row7.x += 1;
		}

		this.add(row7);
		this.add(row6);
		this.add(row5);
		this.add(row4);
		this.add(row3);
		this.add(special);
		this.add(row2);
		this.add(row1);
		this.add(row0);

	}
}
