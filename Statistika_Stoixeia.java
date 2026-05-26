public class Statistika_Stoixeia {
	private float _mesh_timh;
	private float _typikh_apoklish;
	

	public Statistika_Stoixeia(float aMesh_timh, float aTypikh_apoklish) {
		_mesh_timh=aMesh_timh;
		_typikh_apoklish=aTypikh_apoklish;
		
	}
	
	public float getMesh_timh() {
		return this._mesh_timh;
	}

	public void setMesh_timh(float aMesh_timh) {
		this._mesh_timh = aMesh_timh;
	}

	public float getTypikh_apoklish() {
		return this._typikh_apoklish;
	}

	public void setTypikh_apoklish(float aTypikh_apoklish) {
		this._typikh_apoklish = aTypikh_apoklish;
	}
	
	public void printData() {
		System.out.println("Στατιστικά Στοιχεία:");
		System.out.println("Μέση τιμή "+_mesh_timh);
		System.out.println("Τυπική απόκλιση "+_typikh_apoklish);
	}
}