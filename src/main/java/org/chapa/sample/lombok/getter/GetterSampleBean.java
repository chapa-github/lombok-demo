package org.chapa.sample.lombok.getter;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class GetterSampleBean {

	@Getter
	@Setter
	private String name;

	@Getter
	@Setter
	private int id;

	@Getter(AccessLevel.PROTECTED)
	@Setter(AccessLevel.PROTECTED)
	private int age;

}
