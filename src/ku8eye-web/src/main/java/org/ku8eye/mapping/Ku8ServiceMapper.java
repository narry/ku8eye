package org.ku8eye.mapping;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.ku8eye.domain.Ku8Service;

public interface Ku8ServiceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_service
     *
     * @mbggenerated
     */
    @Delete({
        "delete from ku8_service",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_service
     *
     * @mbggenerated
     */
    @Insert({
        "insert into ku8_service (ID, PROJECTID, ",
        "TENANT_ID, OWNER, NAME, ",
        "REPLICA, ICON_URL, ",
        "VERSION, K8S_VERSION, ZONE_ID, ",
        "CLUSTER_ID, RES_PARTION_ID, ",
        "JSON_SPEC, PREV_JSON_SPEC, ",
        "FLAG, STATUS, NOTE, ",
        "LAST_UPDATED)",
        "values (#{id,jdbcType=INTEGER}, #{projectid,jdbcType=INTEGER}, ",
        "#{tenantId,jdbcType=INTEGER}, #{owner,jdbcType=CHAR}, #{name,jdbcType=VARCHAR}, ",
        "#{replica,jdbcType=TINYINT}, #{iconUrl,jdbcType=VARCHAR}, ",
        "#{version,jdbcType=CHAR}, #{k8sVersion,jdbcType=CHAR}, #{zoneId,jdbcType=INTEGER}, ",
        "#{clusterId,jdbcType=INTEGER}, #{resPartionId,jdbcType=INTEGER}, ",
        "#{jsonSpec,jdbcType=VARCHAR}, #{prevJsonSpec,jdbcType=VARCHAR}, ",
        "#{flag,jdbcType=TINYINT}, #{status,jdbcType=TINYINT}, #{note,jdbcType=VARCHAR}, ",
        "#{lastUpdated,jdbcType=TIMESTAMP})"
    })
    int insert(Ku8Service record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_service
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, PROJECTID, TENANT_ID, OWNER, NAME, REPLICA, ICON_URL, VERSION, K8S_VERSION, ",
        "ZONE_ID, CLUSTER_ID, RES_PARTION_ID, JSON_SPEC, PREV_JSON_SPEC, FLAG, STATUS, ",
        "NOTE, LAST_UPDATED",
        "from ku8_service",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROJECTID", property="projectid", jdbcType=JdbcType.INTEGER),
        @Result(column="TENANT_ID", property="tenantId", jdbcType=JdbcType.INTEGER),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="REPLICA", property="replica", jdbcType=JdbcType.TINYINT),
        @Result(column="ICON_URL", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.CHAR),
        @Result(column="K8S_VERSION", property="k8sVersion", jdbcType=JdbcType.CHAR),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="RES_PARTION_ID", property="resPartionId", jdbcType=JdbcType.INTEGER),
        @Result(column="JSON_SPEC", property="jsonSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="PREV_JSON_SPEC", property="prevJsonSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.TINYINT),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    Ku8Service selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_service
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "ID, PROJECTID, TENANT_ID, OWNER, NAME, REPLICA, ICON_URL, VERSION, K8S_VERSION, ",
        "ZONE_ID, CLUSTER_ID, RES_PARTION_ID, JSON_SPEC, PREV_JSON_SPEC, FLAG, STATUS, ",
        "NOTE, LAST_UPDATED",
        "from ku8_service"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="PROJECTID", property="projectid", jdbcType=JdbcType.INTEGER),
        @Result(column="TENANT_ID", property="tenantId", jdbcType=JdbcType.INTEGER),
        @Result(column="OWNER", property="owner", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="REPLICA", property="replica", jdbcType=JdbcType.TINYINT),
        @Result(column="ICON_URL", property="iconUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="VERSION", property="version", jdbcType=JdbcType.CHAR),
        @Result(column="K8S_VERSION", property="k8sVersion", jdbcType=JdbcType.CHAR),
        @Result(column="ZONE_ID", property="zoneId", jdbcType=JdbcType.INTEGER),
        @Result(column="CLUSTER_ID", property="clusterId", jdbcType=JdbcType.INTEGER),
        @Result(column="RES_PARTION_ID", property="resPartionId", jdbcType=JdbcType.INTEGER),
        @Result(column="JSON_SPEC", property="jsonSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="PREV_JSON_SPEC", property="prevJsonSpec", jdbcType=JdbcType.VARCHAR),
        @Result(column="FLAG", property="flag", jdbcType=JdbcType.TINYINT),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.TINYINT),
        @Result(column="NOTE", property="note", jdbcType=JdbcType.VARCHAR),
        @Result(column="LAST_UPDATED", property="lastUpdated", jdbcType=JdbcType.TIMESTAMP)
    })
    List<Ku8Service> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ku8_service
     *
     * @mbggenerated
     */
    @Update({
        "update ku8_service",
        "set PROJECTID = #{projectid,jdbcType=INTEGER},",
          "TENANT_ID = #{tenantId,jdbcType=INTEGER},",
          "OWNER = #{owner,jdbcType=CHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "REPLICA = #{replica,jdbcType=TINYINT},",
          "ICON_URL = #{iconUrl,jdbcType=VARCHAR},",
          "VERSION = #{version,jdbcType=CHAR},",
          "K8S_VERSION = #{k8sVersion,jdbcType=CHAR},",
          "ZONE_ID = #{zoneId,jdbcType=INTEGER},",
          "CLUSTER_ID = #{clusterId,jdbcType=INTEGER},",
          "RES_PARTION_ID = #{resPartionId,jdbcType=INTEGER},",
          "JSON_SPEC = #{jsonSpec,jdbcType=VARCHAR},",
          "PREV_JSON_SPEC = #{prevJsonSpec,jdbcType=VARCHAR},",
          "FLAG = #{flag,jdbcType=TINYINT},",
          "STATUS = #{status,jdbcType=TINYINT},",
          "NOTE = #{note,jdbcType=VARCHAR},",
          "LAST_UPDATED = #{lastUpdated,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Ku8Service record);
}