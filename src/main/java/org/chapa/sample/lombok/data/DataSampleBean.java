package org.chapa.sample.lombok.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataSampleBean {

	private String name;

	private int id;

}
