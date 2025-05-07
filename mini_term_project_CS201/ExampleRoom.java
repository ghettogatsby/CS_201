
public class ExampleRoom {

	public static void main(String[] args) {
		//Robot robot= new Robot(5, 5); // 5x5 room, in top-left
		// or new Robot(5, 4, 1, 2); // 5x4 room, starting 1 over and 2 down
		//Robot robot = new Robot("xxxxx\nxx xx\nx  xxx\nxxxxx", 0, 0); // messy shape
		
		//Problem 1- maze 1:
		/*Robot robot = new Robot("xxx \n  x \n  xx", 0, 0); 
		robot.go('E');
		robot.go('E');
		robot.go('S');
		robot.go('S');
		robot.go('E');
		robot.say("Completed Maze 1!");
		*/

		//Problem 2a- maze 1: 
		/* 
		Robot robot = new Robot("xxx \n  x \n  xx", 0, 0); 
		boolean completed= false; 
		int x= 0;
		int y=0;
	    while (!completed) 
		{
		
			if (robot.check('E')) 
			{
				robot.go('E');
				x+=1;
				
			}else if (robot.check('S')) {
				robot.go('S');
				y-=1;
				
			}else if (robot.check('W')) {
				robot.go('W');
				x-=1;
			
			}else if (robot.check('N')) {
				robot.go('N');
				y+=1;
			}
				
			if (x==3 && y==-2)  
			{
				robot.say("Completed Maze 1!");
				completed= true;
			}}
			
		}
		*/
	
		//Problem 2b- maze 2:
		/* 
		Robot robot = new Robot("xxxxx\n    x\n xxxx\n x   \n xxxx", 0, 0);
		boolean completed= false; 
		int x= 0;
		int y=0;
		String[] visited = new String[100];
        int visited_count = 0; 
        visited[visited_count++] = x + "," + y; 
       
        while (!completed) {
            if (robot.check('E') && !visited_room(visited, visited_count, (x + 1) + "," + y)) {
                robot.go('E');
                x += 1;
            } else if (robot.check('S') && !visited_room(visited, visited_count, x + "," + (y - 1))) {
                robot.go('S');
                y -= 1;
            } else if (robot.check('W') && !visited_room(visited, visited_count, (x - 1) + "," + y)) {
                robot.go('W');
                x -= 1;
            } else if (robot.check('N') && !visited_room(visited, visited_count, x + "," + (y + 1))) {
                robot.go('N');
                y += 1;
            } else {
                break;
            }

            visited[visited_count++] = x + "," + y;

            if (x == 4 && y == -4) {
                robot.say("Completed Maze 2!");
                completed = true;
            }
        }
    }
	*/

	//Problem 2c- maze 3:
	/* 
	    Robot robot = new Robot("xxxxx\n    x\nxxx x\nx xxx\nx    \nxxxxx", 0, 0);
		boolean completed= false; 
		int x= 0;
		int y=0;
		String[] visited = new String[100];
        int visited_count = 0; 
        visited[visited_count++] = x + "," + y; 
       
        while (!completed) {
            if (robot.check('E') && !visited_room(visited, visited_count, (x + 1) + "," + y)) {
                robot.go('E');
                x += 1;
            } else if (robot.check('S') && !visited_room(visited, visited_count, x + "," + (y - 1))) {
                robot.go('S');
                y -= 1;
            } else if (robot.check('W') && !visited_room(visited, visited_count, (x - 1) + "," + y)) {
                robot.go('W');
                x -= 1;
            } else if (robot.check('N') && !visited_room(visited, visited_count, x + "," + (y + 1))) {
                robot.go('N');
                y += 1;
            } else {
                break;
            }

            visited[visited_count++] = x + "," + y;

            if (x == 4 && y == -5) {
                robot.say("Completed Maze 3!");
                completed = true;
            }
        }
    }
	*/

	//Problem 3- maze 4:
	/* 
	Robot robot = new Robot("xxxx\nxx xxx\nx  x\nx xxxx", 0, 0); 
		boolean completed= false; 
		int x= 0;
		int y=0;
		String[] visited = new String[100];
        int visited_count = 0; 
        visited[visited_count++] = x + "," + y; 
		char[] movement_history= new char[100];
		int movement_count=0;
		
        while (!completed) {
			boolean moved= false; 
            if (robot.check('E') && !visited_room(visited, visited_count, (x + 1) + "," + y)) {
                robot.go('E');
                x += 1;
				movement_history[movement_count++]= 'E';
				moved= true;
            } else if (robot.check('S') && !visited_room(visited, visited_count, x + "," + (y - 1))) {
                robot.go('S');
                y -= 1;
				movement_history[movement_count++]= 'S';
				moved= true;
            } else if (robot.check('W') && !visited_room(visited, visited_count, (x - 1) + "," + y)) {
                robot.go('W');
                x -= 1;
				movement_history[movement_count++]= 'W';
				moved= true;
            } else if (robot.check('N') && !visited_room(visited, visited_count, x + "," + (y + 1))) {
                robot.go('N');
                y += 1;
				movement_history[movement_count++]= 'N';
				moved= true;
            } 

			if (!moved && movement_count > 0)
			{
				char last_movement= movement_history[--movement_count];

				switch (last_movement) {
					case 'E':
					    robot.go('W');
						x-= 1;
						break;
					case 'S':
					    robot.go('N');
						y+= 1;
						break;	
					case 'W':
					    robot.go('E');
						x+= 1;
						break;
					case 'N':
					    robot.go('S');
						y-= 1;
						break;
					
				}

			}

            visited[visited_count++] = x + "," + y;

            if (x == 5 && y == -3) {
                robot.say("Completed Maze 4!");
                completed = true;
            }
        }
	}
	*/

	//Problem 3- maze 5/ big maze:
	
	Robot robot = new Robot("xx xx  xxx\n"+   "xx x      \n" +   "x   xxx x \n"
                        +   "xx xx x xx\n" +   " xxxx x x \n"+   "     xxx x\n"
                        +   "xxxxx x xx\n"+   "xxxxxxxxxx\n"+   "xx    x   \n"
                        +   "x xxxxxxxx\n", 0, 0);
		boolean completed= false; 
		int x= 0;
		int y=0;
		String[] visited = new String[100];
        int visited_count = 0; 
        visited[visited_count++] = x + "," + y; 
		char[] movement_history= new char[100];
		int movement_count=0;
		
        while (!completed) {
			boolean moved= false; 
            if (robot.check('E') && !visited_room(visited, visited_count, (x + 1) + "," + y)) {
                robot.go('E');
                x += 1;
				movement_history[movement_count++]= 'E';
				moved= true;
            } else if (robot.check('S') && !visited_room(visited, visited_count, x + "," + (y - 1))) {
                robot.go('S');
                y -= 1;
				movement_history[movement_count++]= 'S';
				moved= true;

            } else if (robot.check('W') && !visited_room(visited, visited_count, (x - 1) + "," + y)) {
                robot.go('W');
                x -= 1;
				movement_history[movement_count++]= 'W';
				moved= true;

            } else if (robot.check('N') && !visited_room(visited, visited_count, x + "," + (y + 1))) {
                robot.go('N');
                y += 1;
				movement_history[movement_count++]= 'N';
				moved= true;
            } 

			if (!moved && movement_count > 0)
			{
				char last_movement= movement_history[--movement_count];

				switch (last_movement) {
					case 'E':
					    robot.go('W');
						x-= 1;
						break;
					case 'S':
					    robot.go('N');
						y+= 1;
						break;	
					case 'W':
					    robot.go('E');
						x+= 1;
						break;
					case 'N':
					    robot.go('S');
						y-= 1;
						break;
					
				}

			}

            visited[visited_count++] = x + "," + y;

            if (x == 9 && y == -9) {
                robot.say("Completed Maze 5/Big Maze!");
                completed = true;
            }
        }
	}
	
		

    public static boolean visited_room(String[] visited, int visited_count, String position) {
        for (int i = 0; i < visited_count; i++) {
            if (visited[i].equals(position)) {
                return true;
            }
        }
        return false;
    }


	
}

    
		


