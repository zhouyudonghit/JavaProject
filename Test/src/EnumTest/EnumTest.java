package EnumTest;

public class EnumTest {
	public enum StringEnum{
		SIT("sit"),PRE("pre"),PRD("prd");
		
		private String value;
		private StringEnum(String v)
		{
			this.value = v;
		}
	}
	
	public enum QueryTypeEnum {
	    /**
	     * 不支持分组
	     */
	    TIMESERIES,
	    /**
	     * 支持单一维度分组
	     */
	    TOPN,
	    /**
	     * 支持多维度分组
	     */
	    GROUPBY;
	}
	
	enum week{Mon,Tue};
	
	public void test1()
	{
//		if(EnumTest.QueryTypeEnum.TOPN.equals(EnumTest.QueryTypeEnum.valueOf("TOPN")))
//		{
//			System.out.print("equal");
//		}
		System.out.print(QueryTypeEnum.TOPN);
		System.out.print(StringEnum.PRD);
		if(StringEnum.PRD.equals(2))
		{
			System.out.print("equal");
		}
		System.out.print(week.Mon);
	}

}

