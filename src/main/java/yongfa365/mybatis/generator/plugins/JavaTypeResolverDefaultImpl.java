package yongfa365.mybatis.generator.plugins;

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;

import java.sql.Types;


public class JavaTypeResolverDefaultImpl extends org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl {

    public  JavaTypeResolverDefaultImpl(){
        super();
        typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT",
                new FullyQualifiedJavaType(Integer.class.getName())));
    }

    @Override
    protected FullyQualifiedJavaType calculateTimestampType(IntrospectedColumn column, FullyQualifiedJavaType defaultType) {
        //return super.calculateTimestampType(column, defaultType);
        return  new FullyQualifiedJavaType("java.time.ZonedDateTime");
    }

    @Override
    protected FullyQualifiedJavaType calculateBigDecimalReplacement(IntrospectedColumn column, FullyQualifiedJavaType defaultType) {
        if (column.getJdbcType() == Types.NUMERIC){

        }
        return super.calculateBigDecimalReplacement(column, defaultType);
    }
}
