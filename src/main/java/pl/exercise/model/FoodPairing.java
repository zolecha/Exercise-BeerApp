package pl.exercise.model;

import javax.persistence.Embeddable;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Embeddable
@JsonFormat(shape=JsonFormat.Shape.ARRAY)
public class FoodPairing {
	@JsonInclude(Include.NON_NULL)		
	String fp0,fp1,fp2,fp3;
	
	public FoodPairing() {

	}

	public String getFp0() {
		return fp0;
	}

	public void setFp0(String fp0) {
		this.fp0 = fp0;
	}

	public String getFp1() {
		return fp1;
	}

	public void setFp1(String fp1) {
		this.fp1 = fp1;
	}

	public String getFp2() {
		return fp2;
	}

	public void setFp2(String fp2) {
		this.fp2 = fp2;
	}

	public String getFp3() {
		return fp3;
	}

	public void setFp3(String fp3) {
		this.fp3 = fp3;
	}
	
	
	
}
