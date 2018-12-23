package cn.ruiz.stu.enu;

public enum Season {

	SPRING("春天","温暖"){
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
	},SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽")
	,WINTER("冬天","寒冷");
	
	private Season(){}
	
	private String name;
	private String weather;
	private Season(String name,String weather) {
		this.name = name;
		this.weather = weather;
	}
	
}
