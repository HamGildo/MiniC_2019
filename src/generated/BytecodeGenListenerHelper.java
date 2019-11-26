package generated;

import java.util.Hashtable;

import generated.MiniCParser;
import generated.MiniCParser.ExprContext;
import generated.MiniCParser.Fun_declContext;
import generated.MiniCParser.If_stmtContext;
import generated.MiniCParser.Local_declContext;
import generated.MiniCParser.ParamContext;
import generated.MiniCParser.ParamsContext;
import generated.MiniCParser.Type_specContext;
import generated.MiniCParser.Var_declContext;
import generated.SymbolTable;
import generated.SymbolTable.VarInfo;

public class BytecodeGenListenerHelper {
	
	// <boolean functions>
	
	static boolean isFunDecl(MiniCParser.ProgramContext ctx, int i) {
		return ctx.getChild(i).getChild(0) instanceof MiniCParser.Fun_declContext;
	}
	
	// type_spec IDENT '[' ']'
	static boolean isArrayParamDecl(ParamContext param) {
		return param.getChildCount() == 4;
	}
	
	// global vars
	static int initVal(Var_declContext ctx) {
		return Integer.parseInt(ctx.LITERAL().getText());
	}

	// var_decl	: type_spec IDENT '=' LITERAL ';
	static boolean isDeclWithInit(Var_declContext ctx) {
		return ctx.getChildCount() == 5 ;
	}
	// var_decl	: type_spec IDENT '[' LITERAL ']' ';'
	static boolean isArrayDecl(Var_declContext ctx) {
		return ctx.getChildCount() == 6;
	}

	// <local vars>
	// local_decl	: type_spec IDENT '[' LITERAL ']' ';'
	static int initVal(Local_declContext ctx) {
		return Integer.parseInt(ctx.LITERAL().getText());
	}

	static boolean isArrayDecl(Local_declContext ctx) {
		return ctx.getChildCount() == 6;
	}
	
	static boolean isDeclWithInit(Local_declContext ctx) {
		return ctx.getChildCount() == 5 ;
	}
	
	static boolean isVoidF(Fun_declContext ctx) {
			// <Fill in>
		if(ctx.type_spec().getText().equals("void")) return true;
		else return false;
	}
	
	static boolean isIntReturn(MiniCParser.Return_stmtContext ctx) {
		return ctx.getChildCount() ==3;
	}


	static boolean isVoidReturn(MiniCParser.Return_stmtContext ctx) {
		return ctx.getChildCount() == 2;
	}
	
	// <information extraction>
	static String getStackSize(Fun_declContext ctx) {
		return "32";
	}
	static String getLocalVarSize(Fun_declContext ctx) {
		return "32";
	}
	static String getTypeText(Type_specContext typespec) {
			// <Fill in>
		String typetext = "";
		if(typespec.getText().equals("int")) { // type이 int라면 I를 넣어줌
			typetext += "I";
		}

		return typetext;
	}

	// params
	static String getParamName(ParamContext param) {
		// <Fill in>
		return param.IDENT().getText(); // 매개변수의 이름을 반환
	}
	
	static String getParamTypesText(ParamsContext params) {
		String typeText = "";
		
		for(int i = 0; i < params.param().size(); i++) {
			MiniCParser.Type_specContext typespec = (MiniCParser.Type_specContext)  params.param(i).getChild(0);
			typeText += getTypeText(typespec); // + ";";
		}
		return typeText; // 매개변수의 타입을 JVM 형식에 맞게 저장하기 위해 반환
	}
	
	static String getLocalVarName(Local_declContext local_decl) { //로컬 변수의 이름을 반환
		// <Fill in>
		String localName = "";
		localName = local_decl.IDENT().getText(); // ctx의 IDENT는 변수의 이름
		return localName;
	}
	
	static String getFunName(Fun_declContext ctx) { //함수의 이름을 반환
		String funName = "";
		funName = ctx.IDENT().getText(); //ctx의 IDENT는 함수의 이름이다.
		return funName;
	}

	static String getFunName(ExprContext ctx) {
		// <Fill in>
		return ctx.IDENT().getText();
	}
	
	static boolean noElse(If_stmtContext ctx) {
		return ctx.getChildCount() < 5;
	}
	
	static String getFunProlog() { // 초반에 클래스 생성부는 통일되기 때문에 직접 넣어준다.
		String prolog = "";
		prolog += ".class public Test\n";
		prolog += ".super java/lang/Object\n";
		prolog += ".method public <init>()V\n";
		prolog += "aload_0\n";
		prolog += "invokenonvirtual java/lang/Object/<init>()V\n";
		prolog += "return\n.end method\n";

		return prolog;
	}
	
	static String getCurrentClassName() {
		return "Test";
	}
}
