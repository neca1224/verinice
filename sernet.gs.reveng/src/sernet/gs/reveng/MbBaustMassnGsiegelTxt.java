package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MbBaustMassnGsiegelTxt generated by hbm2java
 */
public class MbBaustMassnGsiegelTxt implements java.io.Serializable {

	private MbBaustMassnGsiegelTxtId id;
	private Date timestamp;
	private MbBaustMassnGsiegel mbBaustMassnGsiegel;
	private MSprache MSprache;
	private String zusatz;
	private String guid;
	private Byte impNeu;
	private String guidOrg;
	private String erfasstDurch;

	public MbBaustMassnGsiegelTxt() {
	}

	public MbBaustMassnGsiegelTxt(MbBaustMassnGsiegelTxtId id,
			MbBaustMassnGsiegel mbBaustMassnGsiegel, MSprache MSprache,
			String guid) {
		this.id = id;
		this.mbBaustMassnGsiegel = mbBaustMassnGsiegel;
		this.MSprache = MSprache;
		this.guid = guid;
	}

	public MbBaustMassnGsiegelTxt(MbBaustMassnGsiegelTxtId id,
			MbBaustMassnGsiegel mbBaustMassnGsiegel, MSprache MSprache,
			String zusatz, String guid, Byte impNeu, String guidOrg,
			String erfasstDurch) {
		this.id = id;
		this.mbBaustMassnGsiegel = mbBaustMassnGsiegel;
		this.MSprache = MSprache;
		this.zusatz = zusatz;
		this.guid = guid;
		this.impNeu = impNeu;
		this.guidOrg = guidOrg;
		this.erfasstDurch = erfasstDurch;
	}

	public MbBaustMassnGsiegelTxtId getId() {
		return this.id;
	}

	public void setId(MbBaustMassnGsiegelTxtId id) {
		this.id = id;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public MbBaustMassnGsiegel getMbBaustMassnGsiegel() {
		return this.mbBaustMassnGsiegel;
	}

	public void setMbBaustMassnGsiegel(MbBaustMassnGsiegel mbBaustMassnGsiegel) {
		this.mbBaustMassnGsiegel = mbBaustMassnGsiegel;
	}

	public MSprache getMSprache() {
		return this.MSprache;
	}

	public void setMSprache(MSprache MSprache) {
		this.MSprache = MSprache;
	}

	public String getZusatz() {
		return this.zusatz;
	}

	public void setZusatz(String zusatz) {
		this.zusatz = zusatz;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Byte getImpNeu() {
		return this.impNeu;
	}

	public void setImpNeu(Byte impNeu) {
		this.impNeu = impNeu;
	}

	public String getGuidOrg() {
		return this.guidOrg;
	}

	public void setGuidOrg(String guidOrg) {
		this.guidOrg = guidOrg;
	}

	public String getErfasstDurch() {
		return this.erfasstDurch;
	}

	public void setErfasstDurch(String erfasstDurch) {
		this.erfasstDurch = erfasstDurch;
	}

}
