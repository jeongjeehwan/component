package edu.egov.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/* TODO 04-01. Bean 자동 등록을 위한 애노테이션 등록 */
@Service
public class Develop {
 @Autowired
 @Qualifier("programmer")
 private Emp emp;
 public void coding() {
 emp.gotoOffice();
 System.out.println("회사에서 일하는 중 일하는 중 중 ");
 emp.getOffWork();
 }
}