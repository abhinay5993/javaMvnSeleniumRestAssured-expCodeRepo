void main()
{
	
	var testGenMap=new Map<Object,Object>();
	
	testGenMap['test']="sdet";
	testGenMap['2']="muleSoft";
	testGenMap[10]="GuviDart";
	testGenMap[10.3949]="CLmix";
	testGenMap[-6.445]=445.50050;
	
	print(testGenMap);
	
	print(testGenMap.runtimeType);
	
	testGenMap.forEach((key, values) {
    print(
        "key-Type : ${testGenMap.keys.runtimeType} ==> ${testGenMap.values.runtimeType} ");
  });

	
}