
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sun May 10 00:14:44 CEST 2015
//----------------------------------------------------

package modele.analyse;

import java_cup.runtime.*;
import modele.arbre.*;
import modele.arbre.logique.*;
import modele.arbre.mathematique.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sun May 10 00:14:44 CEST 2015
  */
public class AnalyseurSyntaxique extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public AnalyseurSyntaxique() {super();}

  /** Constructor which sets the default scanner. */
  public AnalyseurSyntaxique(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public AnalyseurSyntaxique(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\025\000\002\002\004\000\002\002\003\000\002\004" +
    "\004\000\002\004\003\000\002\003\003\000\002\005\005" +
    "\000\002\005\005\000\002\005\004\000\002\005\005\000" +
    "\002\005\005\000\002\005\005\000\002\005\005\000\002" +
    "\005\005\000\002\005\005\000\002\005\005\000\002\005" +
    "\005\000\002\005\005\000\002\005\004\000\002\005\005" +
    "\000\002\005\003\000\002\005\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\014\005\010\010\013\022\014\024\005\025" +
    "\004\001\002\000\044\002\uffed\005\uffed\006\uffed\007\uffed" +
    "\010\uffed\011\uffed\012\uffed\013\uffed\014\uffed\015\uffed\016" +
    "\uffed\017\uffed\020\uffed\021\uffed\022\uffed\024\uffed\025\uffed" +
    "\001\002\000\044\002\uffee\005\uffee\006\uffee\007\uffee\010" +
    "\uffee\011\uffee\012\uffee\013\uffee\014\uffee\015\uffee\016\uffee" +
    "\017\uffee\020\uffee\021\uffee\022\uffee\024\uffee\025\uffee\001" +
    "\002\000\004\002\050\001\002\000\016\002\ufffe\005\ufffe" +
    "\010\ufffe\022\ufffe\024\ufffe\025\ufffe\001\002\000\014\005" +
    "\010\010\013\022\014\024\005\025\004\001\002\000\042" +
    "\002\ufffd\005\ufffd\007\022\010\026\011\020\012\023\013" +
    "\030\014\024\015\021\016\025\017\016\020\027\021\017" +
    "\022\ufffd\024\ufffd\025\ufffd\001\002\000\016\002\000\005" +
    "\010\010\013\022\014\024\005\025\004\001\002\000\014" +
    "\005\010\010\013\022\014\024\005\025\004\001\002\000" +
    "\014\005\010\010\013\022\014\024\005\025\004\001\002" +
    "\000\044\002\ufff0\005\ufff0\006\ufff0\007\022\010\026\011" +
    "\020\012\023\013\ufff0\014\ufff0\015\ufff0\016\ufff0\017\ufff0" +
    "\020\ufff0\021\ufff0\022\ufff0\024\ufff0\025\ufff0\001\002\000" +
    "\014\005\010\010\013\022\014\024\005\025\004\001\002" +
    "\000\014\005\010\010\013\022\014\024\005\025\004\001" +
    "\002\000\014\005\010\010\013\022\014\024\005\025\004" +
    "\001\002\000\014\005\010\010\013\022\014\024\005\025" +
    "\004\001\002\000\014\005\010\010\013\022\014\024\005" +
    "\025\004\001\002\000\014\005\010\010\013\022\014\024" +
    "\005\025\004\001\002\000\014\005\010\010\013\022\014" +
    "\024\005\025\004\001\002\000\014\005\010\010\013\022" +
    "\014\024\005\025\004\001\002\000\014\005\010\010\013" +
    "\022\014\024\005\025\004\001\002\000\014\005\010\010" +
    "\013\022\014\024\005\025\004\001\002\000\014\005\010" +
    "\010\013\022\014\024\005\025\004\001\002\000\044\002" +
    "\ufff7\005\ufff7\006\ufff7\007\022\010\026\011\020\012\023" +
    "\013\ufff7\014\ufff7\015\ufff7\016\ufff7\017\ufff7\020\ufff7\021" +
    "\ufff7\022\ufff7\024\ufff7\025\ufff7\001\002\000\044\002\ufff2" +
    "\005\ufff2\006\ufff2\007\022\010\026\011\020\012\023\013" +
    "\ufff2\014\ufff2\015\ufff2\016\ufff2\017\ufff2\020\ufff2\021\ufff2" +
    "\022\ufff2\024\ufff2\025\ufff2\001\002\000\044\002\ufffb\005" +
    "\ufffb\006\ufffb\007\ufffb\010\ufffb\011\020\012\023\013\ufffb" +
    "\014\ufffb\015\ufffb\016\ufffb\017\ufffb\020\ufffb\021\ufffb\022" +
    "\ufffb\024\ufffb\025\ufffb\001\002\000\044\002\ufff4\005\ufff4" +
    "\006\ufff4\007\022\010\026\011\020\012\023\013\ufff4\014" +
    "\ufff4\015\ufff4\016\ufff4\017\ufff4\020\ufff4\021\ufff4\022\ufff4" +
    "\024\ufff4\025\ufff4\001\002\000\044\002\ufff6\005\ufff6\006" +
    "\ufff6\007\022\010\026\011\020\012\023\013\ufff6\014\ufff6" +
    "\015\ufff6\016\ufff6\017\ufff6\020\ufff6\021\ufff6\022\ufff6\024" +
    "\ufff6\025\ufff6\001\002\000\044\002\ufff8\005\ufff8\006\ufff8" +
    "\007\ufff8\010\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8\015" +
    "\ufff8\016\ufff8\017\ufff8\020\ufff8\021\ufff8\022\ufff8\024\ufff8" +
    "\025\ufff8\001\002\000\044\002\ufffc\005\ufffc\006\ufffc\007" +
    "\ufffc\010\ufffc\011\020\012\023\013\ufffc\014\ufffc\015\ufffc" +
    "\016\ufffc\017\ufffc\020\ufffc\021\ufffc\022\ufffc\024\ufffc\025" +
    "\ufffc\001\002\000\044\002\ufff5\005\ufff5\006\ufff5\007\022" +
    "\010\026\011\020\012\023\013\ufff5\014\ufff5\015\ufff5\016" +
    "\ufff5\017\ufff5\020\ufff5\021\ufff5\022\ufff5\024\ufff5\025\ufff5" +
    "\001\002\000\044\002\ufff9\005\ufff9\006\ufff9\007\ufff9\010" +
    "\ufff9\011\ufff9\012\ufff9\013\ufff9\014\ufff9\015\ufff9\016\ufff9" +
    "\017\ufff9\020\ufff9\021\ufff9\022\ufff9\024\ufff9\025\ufff9\001" +
    "\002\000\044\002\ufff1\005\ufff1\006\ufff1\007\022\010\026" +
    "\011\020\012\023\013\ufff1\014\ufff1\015\ufff1\016\ufff1\017" +
    "\ufff1\020\ufff1\021\ufff1\022\ufff1\024\ufff1\025\ufff1\001\002" +
    "\000\044\002\ufff3\005\ufff3\006\ufff3\007\022\010\026\011" +
    "\020\012\023\013\ufff3\014\ufff3\015\ufff3\016\ufff3\017\ufff3" +
    "\020\ufff3\021\ufff3\022\ufff3\024\ufff3\025\ufff3\001\002\000" +
    "\044\002\ufffa\005\ufffa\006\ufffa\007\ufffa\010\ufffa\011\020" +
    "\012\023\013\ufffa\014\ufffa\015\ufffa\016\ufffa\017\ufffa\020" +
    "\ufffa\021\ufffa\022\ufffa\024\ufffa\025\ufffa\001\002\000\016" +
    "\002\uffff\005\uffff\010\uffff\022\uffff\024\uffff\025\uffff\001" +
    "\002\000\032\006\047\007\022\010\026\011\020\012\023" +
    "\013\030\014\024\015\021\016\025\017\016\020\027\021" +
    "\017\001\002\000\044\002\uffef\005\uffef\006\uffef\007\uffef" +
    "\010\uffef\011\uffef\012\uffef\013\uffef\014\uffef\015\uffef\016" +
    "\uffef\017\uffef\020\uffef\021\uffef\022\uffef\024\uffef\025\uffef" +
    "\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\012\002\005\003\006\004\011\005\010\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\004\005\045\001\001\000\002\001" +
    "\001\000\006\003\044\005\010\001\001\000\004\005\043" +
    "\001\001\000\004\005\014\001\001\000\002\001\001\000" +
    "\004\005\042\001\001\000\004\005\041\001\001\000\004" +
    "\005\040\001\001\000\004\005\037\001\001\000\004\005" +
    "\036\001\001\000\004\005\035\001\001\000\004\005\034" +
    "\001\001\000\004\005\033\001\001\000\004\005\032\001" +
    "\001\000\004\005\031\001\001\000\004\005\030\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$AnalyseurSyntaxique$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$AnalyseurSyntaxique$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$AnalyseurSyntaxique$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



	StringBuilder fullError = new StringBuilder();
    /* Change the method report_error so it will display the line and column of where the error
       occurred in the input as well as the reason for the error which is passed into the method
       in the String 'message'. */
    public void report_error(String message, Object info) {
   
        /* Create a StringBuffer called 'm' with the string 'Error' in it. */
        StringBuffer m = new StringBuffer("Erreur");
    
        /* Check if the information passed to the method is the same type as the type 
           java_cup.runtime.Symbol. */
        if (info instanceof java_cup.runtime.Symbol) {
            /* Declare a java_cup.runtime.Symbol object 's' with the information in the object 
               info that is being typecasted as a java_cup.runtime.Symbol object. */
            java_cup.runtime.Symbol s = ((java_cup.runtime.Symbol) info);
   
            /* Check if the line number in the input is greater or equal to zero. */
            if (s.left >= 0) {                
                /* Add to the end of the StringBuffer error message the line number of the error 
                   in the input. */
                m.append(" ligne "+(s.left+1));   
                /* Check if the column number in the input is greater or equal to zero. */
                if (s.right >= 0)                    
                    /* Add to the end of the StringBuffer error message the column number of the 
                       error in the input. */
                    m.append(", colonne "+(s.right+1));
            }
        }
        /* Add to the end of the StringBuffer error message created in this method the message that
           was passed into this method. */
        m.append(" : "+message);
   
        /* Print the contents of the StringBuffer 'm', which contains an error message, out on 
           a line. */
        //System.err.println(m);
        fullError.append(m);
    }
    /* Change the method report_fatal_error so when it reports a fatal error it will display the 
       line and column number of where the fatal error occurred in the input as well as the reason
       for the fatal error which is passed into the method in the object 'message' and then exit.*/
    public void report_fatal_error(String message, Object info) {
    	throw new RuntimeException(fullError.toString());
        //report_error(message, info);
        //System.exit(1);
    }

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$AnalyseurSyntaxique$actions {

 



  private final AnalyseurSyntaxique parser;

  /** Constructor */
  CUP$AnalyseurSyntaxique$actions(AnalyseurSyntaxique parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$AnalyseurSyntaxique$do_action(
    int                        CUP$AnalyseurSyntaxique$act_num,
    java_cup.runtime.lr_parser CUP$AnalyseurSyntaxique$parser,
    java.util.Stack            CUP$AnalyseurSyntaxique$stack,
    int                        CUP$AnalyseurSyntaxique$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$AnalyseurSyntaxique$result;

      /* select the action based on the action number */
      switch (CUP$AnalyseurSyntaxique$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // EXPR ::= BOOL 
            {
              Expression RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new Booleen(t,tleft+1,tright+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // EXPR ::= CSTE 
            {
              Expression RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			RESULT = new Nombre(c,cleft+1,cright+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // EXPR ::= PAROUV EXPR PARFER 
            {
              Expression RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		
         	RESULT = e;
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // EXPR ::= NOT EXPR 
            {
              Expression RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new Not(e,eleft+1,eright+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // EXPR ::= EXPR XOR EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new Xor(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // EXPR ::= EXPR OR EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new Ou(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // EXPR ::= EXPR AND EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new Et(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // EXPR ::= EXPR DIFF EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new Different(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // EXPR ::= EXPR EGA EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new Egalite(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // EXPR ::= EXPR INF EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new Inferieure(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // EXPR ::= EXPR SUP EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new Superieure(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // EXPR ::= EXPR DIV EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			RESULT = new Div(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // EXPR ::= EXPR MULT EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			RESULT = new Mult(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // EXPR ::= MOINS EXPR 
            {
              Expression RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
         	RESULT = new MoinsUnaire(e,eleft+1,eright+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // EXPR ::= EXPR MOINS EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			RESULT = new Moins(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // EXPR ::= EXPR PLUS EXPR 
            {
              Expression RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).right;
		Expression e1 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)).value;
		int oleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e2 = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		
			RESULT = new Plus(e1,e2,e1left+1,e1right+1);
         
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("EXPR",3, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-2)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INST ::= EXPR 
            {
              ArbreAbstrait RESULT =null;
		int eleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int eright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		Expression e = (Expression)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 
			RESULT = e;
		 
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("INST",1, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // LINST ::= INST 
            {
              ArbreAbstrait RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		ArbreAbstrait i = (ArbreAbstrait)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 
			BlocDinstructions li = new BlocDinstructions();
			li.ajouter(i);
		  	 RESULT = li;
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("LINST",2, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // LINST ::= LINST INST 
            {
              ArbreAbstrait RESULT =null;
		int lileft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int liright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		ArbreAbstrait li = (ArbreAbstrait)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		int ileft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		ArbreAbstrait i = (ArbreAbstrait)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 
		   li.ajouter(i);
		   RESULT = li;
		
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("LINST",2, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // PROG ::= LINST 
            {
              ArbreAbstrait RESULT =null;
		int lileft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).left;
		int liright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()).right;
		ArbreAbstrait li = (ArbreAbstrait)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.peek()).value;
		 RESULT = li; 
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("PROG",0, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          return CUP$AnalyseurSyntaxique$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= PROG EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).right;
		ArbreAbstrait start_val = (ArbreAbstrait)((java_cup.runtime.Symbol) CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)).value;
		RESULT = start_val;
              CUP$AnalyseurSyntaxique$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.elementAt(CUP$AnalyseurSyntaxique$top-1)), ((java_cup.runtime.Symbol)CUP$AnalyseurSyntaxique$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$AnalyseurSyntaxique$parser.done_parsing();
          return CUP$AnalyseurSyntaxique$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

