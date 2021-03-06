import java.util.Collection;
public class MahJongModel {

	Tile tile = new Tile();

	void positionTile(Tile t, int x, int y, int z) {
		t.x = x;
		t.y = y;
		t.z = z;
	}

	Tile getTile(int x, int y, int z, Collection<Tile> gameTiles) {
		for (Tile tile : gameTiles) {
			if (tile.x == x && tile.y == y && tile.z == z && tile.tileRemoved == false) {
				return tile;
			}
		}
		return null;
	}

	boolean isTileOpen(Tile t, Collection<Tile> gameTiles) {
		
		// Right side special case tile
		if (t.x == 12 && t.y == 4 && t.z == 0) {
			if (getTile(13, 4, 0, gameTiles) == null && getTile(14, 4, 0, gameTiles) == null) {
				return true;
			}
		}
		// Right side special case tile
		else if (t.x == 12 && t.y == 5 && t.z == 0) {
			if (getTile(13, 4, 0, gameTiles) == null && getTile(14, 4, 0, gameTiles) == null) {
				return true;
			}
		}
		// Left side special case tile
		else if (t.x == 1 && t.y == 4 && t.z == 0) {
			if (getTile(0, 5, 1, gameTiles) == null) {
				return true;
			}
		}
		// Left side special case tile
		else if (t.x == 1 && t.y == 5 && t.z == 0) {
			if (getTile(0, 5, 1, gameTiles) == null) {
				return true;
			}
		}
		// Top special case
		else if (t.x == 14 && t.y == 4 && t.z == 0) {
			return true;
		}
		
		// All other tiles (check left neighbor, right neighbor, and top neighbor)
		else if (getTile(t.x + 1, t.y, t.z, gameTiles) == null || getTile(t.x - 1, t.y, t.z, gameTiles) == null) {
			if (getTile(t.x, t.y, t.z+1, gameTiles) == null) {
				return true;
			}
		}
		return false;
	}
}