package study.graph; 

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;


public class SectionNumbering
{
   
   static boolean[][] visited = new boolean[25][25];
   
   static ArrayList<Integer> result = new ArrayList<Integer>();
   
   static int[] x_pos = {-1, 1, 0, 0};
   static int[] y_pos = {0, 0, -1, 1};
   static int count = 0; 
   
   void DFS(int [][] map, int x, int y) {

      for (int i = 0; i < map.length; i++) {
         for (int j = 0; j < map.length; j++) {
            if(!visited[i][j] && map[i][j] == 1){
               count = 1; 
               search(map, i,j); 
               
               result.add(count);
            }
         }
      }
      
      System.out.println(result.size());
      
      Collections.sort(result);
      for(int i = 0; i < result.size(); i++)
      System.out.println(result.get(i));
   }
   
   void  search(int [][] map, int x, int y) {
      visited[x][y] = true; 
      
      for (int i = 0; i < 4; i++) {
            int x_tmp = x + x_pos[i];
            int y_tmp = y + y_pos[i];
            
            if(x_tmp < 0 || x_tmp >= map.length || y_tmp < 0 || y_tmp >= map.length) 
               continue;
      
            if(!visited[x_tmp][y_tmp] && map[x_tmp][y_tmp] == 1){
               count++;
               
               search(map, x_tmp, y_tmp);
            }
      }
   
   }

   public static void main(String[] args) throws Exception {
      SectionNumbering main = new SectionNumbering();
      
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(bf.readLine());

      int [][]map = new int[n][n];
      
      String temp;
      for(int i = 0; i < n; i++){
         temp = bf.readLine();
         for(int j =0; j < n; j++){
            map[i][j] = temp.charAt(j)-'0';
         }
      }
      
      main.DFS(map, 0, 0);
      
   }
}

