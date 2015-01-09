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
public class WorkingSetAVL {
    
    public WorkingSetAVL(){
        
        MAX_SIZE = 64*1024;
        trees = new LogicalOrderingAVL[4];
        for(int i =0; i<4 ; i++)
            trees[i] = new LogicalOrderingAVL(-1,10000000);
        
        PerProcessorList = new MultiList();
        
    }
    private int MAX_SIZE;
    private LogicalOrderingAVL<Integer, String>[] trees;
    private MultiList PerProcessorList;
}
