package tongji.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import tongji.domain.mdm.MdmBobjField;

public interface MdmBobjFieldDao {
	
	public List<MdmBobjField> getMdmBobjField(@Param("str1") String str1);

}
