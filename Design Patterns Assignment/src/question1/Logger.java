package question1;

public class Logger implements Util {
	private volatile static Logger obj_log;
	private Logger(){}
	
	public static Logger getInstance()
	{
		if(obj_log == null)
		{
			synchronized (Logger.class) {
				if(obj_log == null){
					obj_log = new Logger();
				}
			}
		}
		return obj_log;
	}

	@Override
	public void Log(String str) {
		System.out.print("Logged in. ");
		
		System.out.print(str+"\n");	
	}

}
