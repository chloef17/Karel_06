/**
*
* Description of the program goes here  // provide a brief description
*
* @author Chloe Fink
* @version 7.11.14
*/

  import edu.fcps.karel2.Display;
  import edu.fcps.karel2.Robot;
  import javax.swing.JOptionPane;
    
    public class Lab06
   {
       public static void main(String[] args) 
      {
         String filename = JOptionPane.showInputDialog("What robot world?");
         Display.openWorld("maps/" + filename + ".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
      
         task_01(); 
         task_02(); 
         task_03(); 
         task_04();
         task_05(); 
         task_06(); 
      }
      
       public static void task_01()	
      { 
         Robot chandler = new Robot(1, 1, Display.EAST, 0);
         
         while(chandler.nextToABeeper())
         {
            chandler.move();
         }
           
      
      }
       public static void task_02()	
      { 
         Robot monica = new Robot(1, 2, Display.EAST, 0);
         
         while(!monica.nextToABeeper())
         {
            monica.move();
         }
      	
      }
       public static void task_03()	
      { 
         Robot ross = new Robot(1, 3, Display.EAST, 0);
         
         while(ross.frontIsClear())
         {
            ross.move();
         }
       
      }
      
       public static void task_04()	
      { 
         Robot rachel = new Robot(1, 4, Display.EAST, 0);
         {
            while(rachel.frontIsClear())
            {
            
              while(rachel.nextToABeeper())
              {
               rachel.pickBeeper();
               }
               
               rachel.move();
            }
         }
       }
      
       public static void task_05()	
      {
         Robot pheobe = new Robot(1, 5, Display.EAST, 0);
         
         while(pheobe.frontIsClear())
         {
         while(pheobe.nextToABeeper())
         {
            pheobe.pickBeeper();
         }
            pheobe.move();
            
         }
         
         while(!pheobe.frontIsClear()&&pheobe.nextToABeeper())
         {
            pheobe.pickBeeper();
         }
           
        } 
      
       public static void task_06()
      { 
         Robot joey = new Robot(1, 6, Display.EAST, 0);
         while(joey.nextToABeeper())
         {
             joey.move();
         }
         
         while(!joey.nextToABeeper())
          {
               
               joey.move();
               
          }
               
      
      while(joey.nextToABeeper())
         {
             joey.move();
         }

      }
   }
