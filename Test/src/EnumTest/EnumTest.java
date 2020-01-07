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
	     * ��֧�ַ���
	     */
	    TIMESERIES,
	    /**
	     * ֧�ֵ�һά�ȷ���
	     */
	    TOPN,
	    /**
	     * ֧�ֶ�ά�ȷ���
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

