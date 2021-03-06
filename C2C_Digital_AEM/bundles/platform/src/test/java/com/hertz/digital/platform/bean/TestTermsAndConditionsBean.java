package com.hertz.digital.platform.bean;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.slf4j.LoggerFactory;

import junit.framework.Assert;

@RunWith(PowerMockRunner.class)
@PrepareForTest(LoggerFactory.class)
public class TestTermsAndConditionsBean {

	
	@InjectMocks
	private TermsAndConditionBean termsAndConditionBean=new TermsAndConditionBean();
	
	@Mock
	List<TermsAndConditionsSectionBean> mockList;
	
	@Before
	public final void setup() throws Exception{
		termsAndConditionBean.setTermsAndConditions(mockList);
	}
	
	@Test
	public final void testGetterSetter(){
		Assert.assertNotNull(termsAndConditionBean.getTermsAndConditions());
	}
}
