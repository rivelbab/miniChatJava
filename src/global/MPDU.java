package global;

public class MPDU {

	private int cmd;
	private String source;
	private String dest;
	private String data;

	public MPDU(int cmd, String source, String dest, String data) {
		super();
		this.cmd = cmd;
		this.source = source;
		this.dest = dest;
		this.data = data;
	}

	public MPDU(String message) {
		String[] champs = message.split(":");
		if (! champs[0].startsWith("MPDU") || (champs.length !=5) )
			return;
		this.cmd = Integer.parseInt(champs[1]);
		this.source = champs[2];
		this.dest = champs[3];
		this.data = champs[4];
	}

	@Override
	public String toString() {
		return "MPDU:" + cmd + ":"+ source + ":" + dest + ":" + data + ":";
	}
}
