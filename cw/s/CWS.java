/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw.s;
import java.util.*;


/**
 *
 * @author IC018102
 */
public class CWS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LogicalOrderingAVL<Integer,String> Map = new LogicalOrderingAVL<Integer,String>(-1,100000);
        Map.put(12, "me");
        Map.put(13, "myself");
        Map.put(14, "irene");
        
        System.out.println(" the size of the tree is " + Map.size());
    }
    
}
