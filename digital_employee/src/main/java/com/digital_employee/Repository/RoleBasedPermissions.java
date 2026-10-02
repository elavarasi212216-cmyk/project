package com.digital_employee.Repository;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.digital_employee.Enum.Permissions;
import com.digital_employee.Enum.Role;

public class RoleBasedPermissions {
	
	public static Map<Role,Set<Permissions>>getRoleBasedPermissions(){
		
		Map<Role,Set<Permissions>>perm=new HashMap<>();
		
		perm.put(Role.ADMIN, new HashSet<Permissions>(Arrays.asList(
													Permissions.CREATE_EMPLOYEE,
													Permissions.UPDATE_EMPLOYEE,
													Permissions.VIEW_EMPLOYEE,
													Permissions.RUN_PAYROLL,
													Permissions.VIEW_PAYROLL,
													Permissions.APPOVE_LEAVE,
													Permissions.APPOVE_WFH,
													Permissions.VIEW_ANALYSTICES,
													Permissions.VIEW_HOLIDAY,
													Permissions.DELETE_EMPLOYEE)));
		perm.put(Role.HR, new HashSet<Permissions>(Arrays.asList(
													Permissions.CREATE_EMPLOYEE,
													Permissions.UPDATE_EMPLOYEE,
													Permissions.VIEW_EMPLOYEE,
													Permissions.VIEW_PAYROLL,
													Permissions.APPOVE_LEAVE,
													Permissions.APPLY_WFH,
													Permissions.APPOVE_WFH,
													Permissions.VIEW_HOLIDAY,
													Permissions.APPLY_LEAVE)));
		
		perm.put(Role.EMPLOYEE, new HashSet<Permissions>(Arrays.asList(
													Permissions.APPLY_LEAVE,
													Permissions.VIEW_ATTENDANCE,
													Permissions.VIEW_HOLIDAY,
													Permissions.VIEW_PAYROLL,
													Permissions.APPLY_WFH)));
		
		return perm;
		
	}
	

}
