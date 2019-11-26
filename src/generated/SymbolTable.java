package generated;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import generated.MiniCParser;
import generated.MiniCParser.Fun_declContext;
import generated.MiniCParser.Local_declContext;
import generated.MiniCParser.ParamsContext;
import generated.MiniCParser.Type_specContext;
import generated.MiniCParser.Var_declContext;
import generated.SymbolTable.Type;
import static generated.BytecodeGenListenerHelper.*;


public class SymbolTable {
	enum Type {
		INT, INTARRAY, VOID, ERROR
	}
	
	static public class VarInfo {
		Type type; 
		int id;
		int initVal;
		
		public VarInfo(Type type,  int id, int initVal) {
			this.type = type;
			this.id = id;
			this.initVal = initVal;
		}
		public VarInfo(Type type,  int id) {
			this.type = type;
			this.id = id;
			this.initVal = 0;
		}
	}
	
	static public class FInfo {
		public String sigStr;
	}
	
	private Map<String, VarInfo> _lsymtable = new HashMap<>();	// local v.
	private Map<String, VarInfo> _gsymtable = new HashMap<>();	// global v.
	private Map<String, FInfo> _fsymtable = new HashMap<>();	// function 
	
		
	private int _globalVarID = 0;
	private int _localVarID = 0;
	private int _labelID = 0;
	private int _tempVarID = 0;
	
	SymbolTable(){
		initFunDecl();
		initFunTable();
	}
	
	void initFunDecl(){		// at each func decl
		_localVarID = 0;
		_labelID = 0;
		_tempVarID = 32;
		_lsymtable.clear(); // 로컬변수는 함수가 끝나면 소멸
	}
	
	void putLocalVar(String varname, Type type){
		//<Fill here>
        int localTableSize = _lsymtable.size(); //현재 로컬테이블에 몇개가 있는지 알아냄
        VarInfo localinfo = new VarInfo(type, localTableSize); // 이미 다른 변수가 차지한 번호 다음 번호부터 매긴다.
        _lsymtable.put(varname, localinfo);
	}
	
	void putGlobalVar(String varname, Type type){ //글로벌 변수는 없다고 가정하기에 무시한다.
		//<Fill here>

	}
	
	void putLocalVarWithInitVal(String varname, Type type, int initVar){
		//<Fill here>
		int localTableSize = _lsymtable.size(); //현재 로컬테이블에 몇개가 있는지 알아냄
		VarInfo localinfo = new VarInfo(type, localTableSize, initVar); // 이미 다른 변수가 차지한 번호 다음 번호부터 매긴다.
		_lsymtable.put(varname, localinfo);
	}
	void putGlobalVarWithInitVal(String varname, Type type, int initVar){ //글로벌 변수는 없다고 가정하기에 무시한다.
		//<Fill here>
	
	}
	
	void putParams(MiniCParser.ParamsContext params) {
		for(int i = 0; i < params.param().size(); i++) { //매개변수 모두를 로컬테이블에 미리 넣어줌
		//<Fill here>
			VarInfo paraminfo = new VarInfo(Type.INT,i); // MiniC의 매개변수의 타입은 int
			_lsymtable.put(getParamName(params.param(i)), paraminfo); // 매개변수는 로컬 테이블에 넣는다
		}
	}
	
	private void initFunTable() {
		FInfo printlninfo = new FInfo();
		printlninfo.sigStr = "java/io/PrintStream/println(I)V";
		
		FInfo maininfo = new FInfo();
		maininfo.sigStr = "main([Ljava/lang/String;)V";
		_fsymtable.put("_print", printlninfo);
		_fsymtable.put("main", maininfo);
	}
	
	public String getFunSpecStr(String fname) {		
		// <Fill here>
        String funspec = "";
        FInfo fInfo = _fsymtable.get(fname); // 함수 테이블에서 함수 이름을 통해 그에 맞는 폼을 찾은 후
        funspec += fInfo.sigStr; // 해당 폼을 반환
        return funspec;
	}

	public String getFunSpecStr(Fun_declContext ctx) {
		// <Fill here>
        return getFunSpecStr(getFunName(ctx));
	}
	
	public String putFunSpecStr(Fun_declContext ctx) {
		String fname = getFunName(ctx);
		String argtype = "";	
		String rtype = "";
		String res = "";
		
		// <Fill here>
		argtype += getParamTypesText(ctx.params()); // 가지고 있는 매개변수의 타입들을 넣어줌
		if(isVoidF(ctx)) { //void 리턴 함수
			rtype += "V";
		}
		else rtype += "I"; //int 리턴 함수

		res =  fname + "(" + argtype + ")" + rtype;
		
		FInfo finfo = new FInfo();
		finfo.sigStr = res;
		_fsymtable.put(fname, finfo);
		
		return res;
	}
	
	String getVarId(String name){
		// <Fill here>
        String sname = "";
        VarInfo varInfo = _lsymtable.get(name);
        sname = Integer.toString(varInfo.id); // 함수의 이름으로 테이블에 있는 var정보를 찾아 id를 리턴
        return sname;
	}
	
	Type getVarType(String name){
		VarInfo lvar = (VarInfo) _lsymtable.get(name);
		if (lvar != null) {
			return lvar.type;
		}
		
		VarInfo gvar = (VarInfo) _gsymtable.get(name);
		if (gvar != null) {
			return gvar.type;
		}
		
		return Type.ERROR;	
	}
	String newLabel() {
		return "label" + _labelID++;
	}
	
	String newTempVar() {
		String id = "";
		return id + _tempVarID--;
	}

//	// global
//	public String getVarId(Var_declContext ctx) { //글로벌 무시
//		// <Fill here>
//	}

	// local
	public String getVarId(Local_declContext ctx) {
		String sname = "";
		sname += getVarId(ctx.IDENT().getText()); // 함수 이름으로 id를 찾아주는 함수를 콜
		return sname; // id 반환
	}
	
}
