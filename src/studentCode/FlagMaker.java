package studentCode;
import java.awt.Color;
import GridTools.MyGrid;

public class FlagMaker {

	public static void drawFlag(MyGrid grid, int countryCode) {
		
		final int width = grid.getWd();
		final int height = grid.getHt();
		final int INDONESIA = 1;
		final int LITHUANIA = 2;
		final int RWANDA = 3;
		final int MALTA = 4;
		final int AFGHANISTAN = 5;
		final int ERITREA = 6;
		final int MACEDONIA = 7;
		final int THE_BAHAMAS = 8;
		final int ZIMBABWE = 9;
		
		if (countryCode == INDONESIA && height % 2 == 0) {
			Color fullColor = Color.RED;
			Color bottomHalfColor = Color.WHITE;
			colorFullFlag(grid, width, height, fullColor);
			colorBottomHalfFlag(grid, width, height, bottomHalfColor);
		} else if (countryCode == LITHUANIA && height % 3 == 0) {
			Color colorFull = Color.YELLOW;
			colorFullFlag(grid, width, height, colorFull);
			for (int row = height / 3; row < height; row = row + 1) {
				for (int col = 0; col < width; col = col + 1) {
					grid.setColor(row, col, Color.GREEN);
				}
			}
			for (int row = height / 3 * 2; row < height; row = row + 1) {
				for (int col = 0; col < width; col = col + 1) {
					grid.setColor(row, col, Color.RED);
				}
			}
		} else if (countryCode == RWANDA && height % 4 == 0) {
			Color colorFull = Color.BLUE;
			Color bottomHalfColor = Color.YELLOW;
			colorFullFlag(grid, width, height, colorFull);
			colorBottomHalfFlag(grid, width, height, bottomHalfColor);
			for (int row = height / 4 * 3; row < height; row = row + 1) {
				for (int col = 0; col < width; col = col + 1) {
					grid.setColor(row, col, Color.GREEN);
				}
			}
		} else if (countryCode == MALTA) {
			Color colorFull = Color.WHITE;
			colorFullFlag(grid, width, height, colorFull);
			for (int row = 0; row < height; row = row + 1) {
				for (int col = width / 2; col < width; col = col + 1) {
					grid.setColor(row, col, Color.RED);
				}
			}
		} else if (countryCode == AFGHANISTAN && height % 3 == 0) {
			Color colorFull = Color.BLACK;
			colorFullFlag(grid, width, height, colorFull);
			for (int row = 0; row < height; row = row + 1) {
				for (int col = width / 3; col < width; col = col + 1) {
					grid.setColor(row, col, Color.RED);
				}
			}
			for (int row = 0; row < height; row = row + 1) {
				for (int col = width / 3 * 2; col < width; col = col + 1) {
					grid.setColor(row, col, Color.GREEN);
				}
			}
		} else if (countryCode == ERITREA) {
			Color fullColor = Color.GREEN;
			Color bottomHalfColor = Color.BLUE;
			colorFullFlag(grid, width, height, fullColor);
			colorBottomHalfFlag(grid, width, height, bottomHalfColor);
			int frontColEnd = 4;
			for (int row = 0; row < height / 2 + 1; row = row + 1) {
				for (int col = 0; col < frontColEnd ; col = col + 1) {
					grid.setColor(row, col, Color.RED);
				}
				if (frontColEnd >= width - 2) {
					frontColEnd = width;
				} else {
					frontColEnd = frontColEnd + 4;
				}
			}
			frontColEnd = 4;
			for (int row = height - 1; row > height / 2; row = row - 1) {
				for (int col = 0; col < frontColEnd ; col = col + 1) {
					grid.setColor(row, col, Color.RED);
				}
				if (frontColEnd >= width - 2) {
					frontColEnd = width;
				} else {
					frontColEnd = frontColEnd + 4;
				}
			}
		} else if (countryCode == MACEDONIA && height >= 8 && height % 2 == 0) {
			Color fullColor = Color.RED;
			colorFullFlag(grid, width, height, fullColor);
			int frontColEnd = 2;
			int backColStart = 0;
			for (int row = 0; row < height; row = row + 1) {
				for (int col = backColStart; col < frontColEnd; col = col + 1) {
					grid.setColor(row, col, Color.ORANGE);
				}
				frontColEnd = frontColEnd + 2;
				backColStart = backColStart + 2;
			}
			frontColEnd = 2;
			backColStart = 0;
			for (int row = height - 1; row >= 0; row = row - 1) {
				for (int col = backColStart; col < frontColEnd; col = col + 1) {
					grid.setColor(row, col, Color.ORANGE);
				}
				frontColEnd = frontColEnd + 2;
				backColStart = backColStart + 2;
			}
			for (int row = height / 2 - 1; row < height / 2 + 1; row = row
					+ 1) {
				for (int col = 0; col < width; col = col + 1) {
					grid.setColor(row, col, Color.ORANGE);
				}
			}
			for (int row = 0; row < height; row = row + 1) {
				for (int col = width / 2 - 1; col < width / 2 + 1; col = col
						+ 1) {
					grid.setColor(row, col, Color.ORANGE);
				}
			}
			for (int row = height / 2 - 2; row < height / 2 + 2; row = row + 1)
			{
				for (int col = width / 2 - 4; col < width / 2 + 4; col = col
						+ 1) {
					grid.setColor(row, col, Color.ORANGE);
				}
			}
		} else if (countryCode == THE_BAHAMAS && height % 3 == 0 && height % 2
				== 1) {
			
			Color fullColor = Color.BLUE;
			Color leftTriangleColor = Color.BLACK;
			colorFullFlag(grid, width, height, fullColor);
			for (int row = height / 3; row < height / 3 * 2; row = row + 1) {
				for (int col = 0; col < width; col = col + 1) {
					grid.setColor(row, col, Color.YELLOW);
				}
			}
			colorLeftTriangleFlag(grid, width, height, leftTriangleColor);
		} else if (countryCode == ZIMBABWE && height % 7 == 0) {
			Color fullColor = Color.GREEN;
			Color leftTriangleColor = Color.WHITE;
			colorFullFlag(grid, width, height, fullColor);
			for (int row = height / 7; row < height / 7 * 6; row = row + 1) {
				for (int col = 0; col < width; col = col + 1) {
					grid.setColor(row, col, Color.YELLOW);
				}
			}
			for (int row = height / 7 * 2; row < height / 7 * 5; row = row + 1)
			{
				for (int col = 0; col < width; col = col + 1) {
					grid.setColor(row, col, Color.RED);
				}
			}
			for (int row = height / 7 * 3; row < height / 7 * 4; row = row + 1)
			{
				for (int col = 0; col < width; col = col + 1) {
					grid.setColor(row, col, Color.BLACK);
				}
			}
			colorLeftTriangleFlag(grid, width, height, leftTriangleColor);
		} else {
			/* This is the code for the Error Flag. */
			Color fullColor = Color.WHITE;
			colorFullFlag(grid, width, height, fullColor);
			grid.setColor(0, 0, Color.RED);
			grid.setColor(0, width - 1, Color.YELLOW);
			grid.setColor(height - 1, 0, Color.BLUE);
			grid.setColor(height - 1, width - 1, Color.GREEN);
		}
	}	
	
	/* Method for filling entire flag with a single color*/
	public static void colorFullFlag (MyGrid grid, int width, int height, Color 
			colorFull) {
		
		for (int row = 0; row < height; row = row + 1) {
			for (int col = 0; col < width; col = col + 1) {
				grid.setColor(row, col, colorFull);
			}
		}
	}
	
	/* Method for filling bottom half of flag with a single color */
	public static void colorBottomHalfFlag (MyGrid grid, int width, int height, 
			Color bottomHalfColor) {
		
		for (int row = height / 2; row < height; row = row + 1) {
			for (int col = 0; col < width; col = col + 1) {
				grid.setColor(row, col, bottomHalfColor);
			}
		}
	}
	
	/* Method for coloring left side of flag with a triangle */
	public static void colorLeftTriangleFlag (MyGrid grid, int width, int height
			, Color leftTriangleColor) {
		
		int frontColEnd = width / width;
		for (int row = 0; row < height / 2 ; row = row + 1) {
			for (int col = 0; col < frontColEnd ; col = col + 1) {
				grid.setColor(row, col, leftTriangleColor);
			}
			 frontColEnd = frontColEnd + 1;
		}
		 frontColEnd = width/width;
		for (int row = height - 1; row > height / 2 - 1; row = row - 1) {
			for (int col = 0; col < frontColEnd ; col = col + 1) {
				grid.setColor(row, col, leftTriangleColor);
			}
			 frontColEnd = frontColEnd + 1;
		}
	
	}

}