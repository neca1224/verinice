package sernet.gs.reveng;

// Generated Jun 5, 2015 1:28:30 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * MbMasGef generated by hbm2java
 */
public class MbMasGef implements java.io.Serializable {

	private MbMasGefId id;
	private MbMassn mbMassn;
	private MSchutzbedarfkateg MSchutzbedarfkategByG2mTransSbkId;
	private MSchutzbedarfkateg MSchutzbedarfkategBySbkIdGesamt;
	private MSchutzbedarfkateg MSchutzbedarfkategByG2mRevisSbkId;
	private MSchutzbedarfkateg MSchutzbedarfkategBySbkIdVertr;
	private MSchutzbedarfkateg MSchutzbedarfkategBySbkIdPers;
	private MSchutzbedarfkateg MSchutzbedarfkategByG2mAutenSbkId;
	private SysImport sysImport;
	private MSchutzbedarfkateg MSchutzbedarfkategBySbkIdInteg;
	private MbGefaehr mbGefaehr;
	private MSchutzbedarfkateg MSchutzbedarfkategBySbkIdVerf;
	private Integer persDaten;
	private Integer type;
	private Integer metaVers;
	private Byte metaNeu;
	private Integer obsoletVers;
	private Date erfasstAm;
	private String erfasstDurch;
	private Date geloeschtAm;
	private String geloeschtDurch;
	private Date changedOn;
	private String changedBy;
	private String guid;
	private String guidOrg;
	private Byte impNeu;
	private Integer usn;

	public MbMasGef() {
	}

	public MbMasGef(MbMasGefId id, MbMassn mbMassn, SysImport sysImport,
			MbGefaehr mbGefaehr, Date erfasstAm, String erfasstDurch,
			String guid) {
		this.id = id;
		this.mbMassn = mbMassn;
		this.sysImport = sysImport;
		this.mbGefaehr = mbGefaehr;
		this.erfasstAm = erfasstAm;
		this.erfasstDurch = erfasstDurch;
		this.guid = guid;
	}

	public MbMasGef(MbMasGefId id, MbMassn mbMassn,
			MSchutzbedarfkateg MSchutzbedarfkategByG2mTransSbkId,
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdGesamt,
			MSchutzbedarfkateg MSchutzbedarfkategByG2mRevisSbkId,
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdVertr,
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdPers,
			MSchutzbedarfkateg MSchutzbedarfkategByG2mAutenSbkId,
			SysImport sysImport,
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdInteg,
			MbGefaehr mbGefaehr,
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdVerf,
			Integer persDaten, Integer type, Integer metaVers, Byte metaNeu,
			Integer obsoletVers, Date erfasstAm, String erfasstDurch,
			Date geloeschtAm, String geloeschtDurch, Date changedOn,
			String changedBy, String guid, String guidOrg, Byte impNeu,
			Integer usn) {
		this.id = id;
		this.mbMassn = mbMassn;
		this.MSchutzbedarfkategByG2mTransSbkId = MSchutzbedarfkategByG2mTransSbkId;
		this.MSchutzbedarfkategBySbkIdGesamt = MSchutzbedarfkategBySbkIdGesamt;
		this.MSchutzbedarfkategByG2mRevisSbkId = MSchutzbedarfkategByG2mRevisSbkId;
		this.MSchutzbedarfkategBySbkIdVertr = MSchutzbedarfkategBySbkIdVertr;
		this.MSchutzbedarfkategBySbkIdPers = MSchutzbedarfkategBySbkIdPers;
		this.MSchutzbedarfkategByG2mAutenSbkId = MSchutzbedarfkategByG2mAutenSbkId;
		this.sysImport = sysImport;
		this.MSchutzbedarfkategBySbkIdInteg = MSchutzbedarfkategBySbkIdInteg;
		this.mbGefaehr = mbGefaehr;
		this.MSchutzbedarfkategBySbkIdVerf = MSchutzbedarfkategBySbkIdVerf;
		this.persDaten = persDaten;
		this.type = type;
		this.metaVers = metaVers;
		this.metaNeu = metaNeu;
		this.obsoletVers = obsoletVers;
		this.erfasstAm = erfasstAm;
		this.erfasstDurch = erfasstDurch;
		this.geloeschtAm = geloeschtAm;
		this.geloeschtDurch = geloeschtDurch;
		this.changedOn = changedOn;
		this.changedBy = changedBy;
		this.guid = guid;
		this.guidOrg = guidOrg;
		this.impNeu = impNeu;
		this.usn = usn;
	}

	public MbMasGefId getId() {
		return this.id;
	}

	public void setId(MbMasGefId id) {
		this.id = id;
	}

	public MbMassn getMbMassn() {
		return this.mbMassn;
	}

	public void setMbMassn(MbMassn mbMassn) {
		this.mbMassn = mbMassn;
	}

	public MSchutzbedarfkateg getMSchutzbedarfkategByG2mTransSbkId() {
		return this.MSchutzbedarfkategByG2mTransSbkId;
	}

	public void setMSchutzbedarfkategByG2mTransSbkId(
			MSchutzbedarfkateg MSchutzbedarfkategByG2mTransSbkId) {
		this.MSchutzbedarfkategByG2mTransSbkId = MSchutzbedarfkategByG2mTransSbkId;
	}

	public MSchutzbedarfkateg getMSchutzbedarfkategBySbkIdGesamt() {
		return this.MSchutzbedarfkategBySbkIdGesamt;
	}

	public void setMSchutzbedarfkategBySbkIdGesamt(
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdGesamt) {
		this.MSchutzbedarfkategBySbkIdGesamt = MSchutzbedarfkategBySbkIdGesamt;
	}

	public MSchutzbedarfkateg getMSchutzbedarfkategByG2mRevisSbkId() {
		return this.MSchutzbedarfkategByG2mRevisSbkId;
	}

	public void setMSchutzbedarfkategByG2mRevisSbkId(
			MSchutzbedarfkateg MSchutzbedarfkategByG2mRevisSbkId) {
		this.MSchutzbedarfkategByG2mRevisSbkId = MSchutzbedarfkategByG2mRevisSbkId;
	}

	public MSchutzbedarfkateg getMSchutzbedarfkategBySbkIdVertr() {
		return this.MSchutzbedarfkategBySbkIdVertr;
	}

	public void setMSchutzbedarfkategBySbkIdVertr(
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdVertr) {
		this.MSchutzbedarfkategBySbkIdVertr = MSchutzbedarfkategBySbkIdVertr;
	}

	public MSchutzbedarfkateg getMSchutzbedarfkategBySbkIdPers() {
		return this.MSchutzbedarfkategBySbkIdPers;
	}

	public void setMSchutzbedarfkategBySbkIdPers(
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdPers) {
		this.MSchutzbedarfkategBySbkIdPers = MSchutzbedarfkategBySbkIdPers;
	}

	public MSchutzbedarfkateg getMSchutzbedarfkategByG2mAutenSbkId() {
		return this.MSchutzbedarfkategByG2mAutenSbkId;
	}

	public void setMSchutzbedarfkategByG2mAutenSbkId(
			MSchutzbedarfkateg MSchutzbedarfkategByG2mAutenSbkId) {
		this.MSchutzbedarfkategByG2mAutenSbkId = MSchutzbedarfkategByG2mAutenSbkId;
	}

	public SysImport getSysImport() {
		return this.sysImport;
	}

	public void setSysImport(SysImport sysImport) {
		this.sysImport = sysImport;
	}

	public MSchutzbedarfkateg getMSchutzbedarfkategBySbkIdInteg() {
		return this.MSchutzbedarfkategBySbkIdInteg;
	}

	public void setMSchutzbedarfkategBySbkIdInteg(
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdInteg) {
		this.MSchutzbedarfkategBySbkIdInteg = MSchutzbedarfkategBySbkIdInteg;
	}

	public MbGefaehr getMbGefaehr() {
		return this.mbGefaehr;
	}

	public void setMbGefaehr(MbGefaehr mbGefaehr) {
		this.mbGefaehr = mbGefaehr;
	}

	public MSchutzbedarfkateg getMSchutzbedarfkategBySbkIdVerf() {
		return this.MSchutzbedarfkategBySbkIdVerf;
	}

	public void setMSchutzbedarfkategBySbkIdVerf(
			MSchutzbedarfkateg MSchutzbedarfkategBySbkIdVerf) {
		this.MSchutzbedarfkategBySbkIdVerf = MSchutzbedarfkategBySbkIdVerf;
	}

	public Integer getPersDaten() {
		return this.persDaten;
	}

	public void setPersDaten(Integer persDaten) {
		this.persDaten = persDaten;
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getMetaVers() {
		return this.metaVers;
	}

	public void setMetaVers(Integer metaVers) {
		this.metaVers = metaVers;
	}

	public Byte getMetaNeu() {
		return this.metaNeu;
	}

	public void setMetaNeu(Byte metaNeu) {
		this.metaNeu = metaNeu;
	}

	public Integer getObsoletVers() {
		return this.obsoletVers;
	}

	public void setObsoletVers(Integer obsoletVers) {
		this.obsoletVers = obsoletVers;
	}

	public Date getErfasstAm() {
		return this.erfasstAm;
	}

	public void setErfasstAm(Date erfasstAm) {
		this.erfasstAm = erfasstAm;
	}

	public String getErfasstDurch() {
		return this.erfasstDurch;
	}

	public void setErfasstDurch(String erfasstDurch) {
		this.erfasstDurch = erfasstDurch;
	}

	public Date getGeloeschtAm() {
		return this.geloeschtAm;
	}

	public void setGeloeschtAm(Date geloeschtAm) {
		this.geloeschtAm = geloeschtAm;
	}

	public String getGeloeschtDurch() {
		return this.geloeschtDurch;
	}

	public void setGeloeschtDurch(String geloeschtDurch) {
		this.geloeschtDurch = geloeschtDurch;
	}

	public Date getChangedOn() {
		return this.changedOn;
	}

	public void setChangedOn(Date changedOn) {
		this.changedOn = changedOn;
	}

	public String getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getGuidOrg() {
		return this.guidOrg;
	}

	public void setGuidOrg(String guidOrg) {
		this.guidOrg = guidOrg;
	}

	public Byte getImpNeu() {
		return this.impNeu;
	}

	public void setImpNeu(Byte impNeu) {
		this.impNeu = impNeu;
	}

	public Integer getUsn() {
		return this.usn;
	}

	public void setUsn(Integer usn) {
		this.usn = usn;
	}

}
