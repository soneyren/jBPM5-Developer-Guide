/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salaboy.jbpm5.dev.guide;

import com.salaboy.jbpm5.dev.guide.executor.CommandContext;
import com.salaboy.jbpm5.dev.guide.executor.CommandCallback;
import com.salaboy.jbpm5.dev.guide.executor.ExecutionResults;

/**
 *
 * @author salaboy
 */
public class DoNothingCallback implements CommandCallback{

    public void onCommandDone(CommandContext ctx, ExecutionResults results) {
        System.out.println(" ??? Doing Nothing Handler .................!");
    }
    
}