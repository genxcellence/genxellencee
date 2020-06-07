package com.capgroup.digital.pdftemplate.domain.mockdata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class TestData {

	public static void main(String args[]) {
		Map<String , Object> data = new HashMap<String, Object>();
		getMileStoneData(data);
		getPriceItFormData(data);
		getPriceItResultData(data);
		System.out.println(data.size());
	}
	
	public static Map<String, Object> getPriceItFormData(Map<String, Object> data) {
		 	Gson gson = new Gson();
	        String input = "{clientName:Test,planType:pptpa,planAssets:20000,estimatedAnnContributions:50000,wilShireService:NA,isEDJ:false,numParticipants:2,shareClassTypesR2:R-2,shareClassTypesR2E:R-2E,shareClassTypesR3:R-3,shareClassTypesR4:R-4,shareClassTypesR5E:R-5E,shareClassTypesR5:R-5,shareClassTypesR6:null,tpaFee:12000,adviserFee:null,isDollarAdviserFee:null,mShareClassType:null,mileStone:null,mr2:R-2,mr2e:R-2E,mr3:R-3,mr4:R-4,mr5e:R-5E,mr5:R-5,mr6:null,includeMileStone:true,includeResult:true,calculateCost:null,clientVersion:CreatePDF,previous:null,fileName:price-it-tool-report.pdf,pdfPluginInstalled:false,priceBand1:null,priceBand2:null,priceBand3:null,priceBand4:null,priceBand5:null,priceBand6:null,priceBand7:null,priceBand8:null,milestonePriceBand1:null,milestonePriceBand2:null,milestonePriceBand3:null,milestonePriceBand4:null,milestonePriceBand5:null,milestonePriceBand6:null,milestonePriceBand7:null,milestonePriceBand8:null,adviserFeeGVA:null,isDollarAdviserFeeGVA:null,isCompanyHeadQuarterInNewYork:null,adviserHighLowFee:null,creditR2:null,creditR2e:null,creditR3:null,creditR4:null,creditR5:0,creditR5e:0,creditR6:0,r2Fpo:0.65,r2eFpo:0.5,r3Fpo:0.35,r4Fpo:0.25,r5eFpo:0,r5po:0,r6po:null,page:0}";         	        
	        PriceItForm form = gson.fromJson(input, PriceItForm.class);
	        data.put("priceIt", form);
	        return data;
	}
	
	public static Map<String, Object> getPriceItResultData(Map<String, Object> data) {
		 Gson gson = new Gson();
		 String sPriceRes1 = "{isRestricted:false,shareClassType:R-2,oneTimeFee:0.0,annualFee:2400.0,baseFee:0.0,perParticipantFee:0.0,annualRKDFee:0.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,planCredit:-280.0,planCreditPercent:0.4,netCredit:2120.0,annualTPAFee:12000.0,investAvgExpRatio:1.49,investDollarCost:1043.0,adviserFeePercent:0.0,adviserFeeDollar:0.0,planCostPct:21.66,planCostDollar:15163.0,dealerCompPct:0.65,dealerCompDollar:455.0,feeBasedCompPct:0.65,feeBasedCompDollar:455.0,creditAmountPct:0.0,creditAmountDollar:0.0}";
	        PriceItResult res1 = gson.fromJson(sPriceRes1, PriceItResult.class);
	        String sPriceRes2 = "{isRestricted:false,shareClassType:R-2E,oneTimeFee:0.0,annualFee:2400.0,baseFee:0.0,perParticipantFee:0.0,annualRKDFee:0.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,planCredit:-175.0,planCreditPercent:0.25,netCredit:2225.0,annualTPAFee:12000.0,investAvgExpRatio:1.18,investDollarCost:826.0,adviserFeePercent:0.0,adviserFeeDollar:0.0,planCostPct:21.5,planCostDollar:15051.0,dealerCompPct:0.5,dealerCompDollar:350.0,feeBasedCompPct:0.5,feeBasedCompDollar:350.0,creditAmountPct:0.0,creditAmountDollar:0.0}";
	        PriceItResult res2 = gson.fromJson(sPriceRes2, PriceItResult.class);
	        String sR3 = "{isRestricted:false,shareClassType:R-3,oneTimeFee:0.0,annualFee:2400.0,baseFee:0.0,perParticipantFee:0.0,annualRKDFee:0.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,planCredit:-175.0,planCreditPercent:0.25,netCredit:2225.0,annualTPAFee:12000.0,investAvgExpRatio:1.06,investDollarCost:742.0,adviserFeePercent:0.0,adviserFeeDollar:0.0,planCostPct:21.38,planCostDollar:14967.0,dealerCompPct:0.35,dealerCompDollar:244.99999999999997,feeBasedCompPct:0.35,feeBasedCompDollar:244.99999999999997,creditAmountPct:0.0,creditAmountDollar:0.0}";
	        PriceItResult res3 = gson.fromJson(sR3, PriceItResult.class);
	        String sR4 = "{isRestricted:false,shareClassType:R-4,oneTimeFee:0.0,annualFee:2400.0,baseFee:0.0,perParticipantFee:0.0,annualRKDFee:0.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,planCredit:-35.0,planCreditPercent:0.05,netCredit:2365.0,annualTPAFee:12000.0,investAvgExpRatio:0.73,investDollarCost:511.0,adviserFeePercent:0.0,adviserFeeDollar:0.0,planCostPct:21.25,planCostDollar:14876.0,dealerCompPct:0.25,dealerCompDollar:175.0,feeBasedCompPct:0.25,feeBasedCompDollar:175.0,creditAmountPct:0.0,creditAmountDollar:0.0}";
	        PriceItResult res4 = gson.fromJson(sR4, PriceItResult.class);
	        String sR5 = "{isRestricted:false,shareClassType:R-5E,oneTimeFee:0.0,annualFee:2400.0,baseFee:0.0,perParticipantFee:0.0,annualRKDFee:0.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,planCredit:-105.0,planCreditPercent:0.15,netCredit:2295.0,annualTPAFee:12000.0,investAvgExpRatio:0.5,investDollarCost:350.0,adviserFeePercent:0.0,adviserFeeDollar:0.0,planCostPct:20.92,planCostDollar:14645.0,dealerCompPct:0.0,dealerCompDollar:0.0,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0}";
	        PriceItResult res5 = gson.fromJson(sR5, PriceItResult.class);
	        String sR6 = "{isRestricted:false,shareClassType:R-5,oneTimeFee:0.0,annualFee:2400.0,baseFee:0.0,perParticipantFee:0.0,annualRKDFee:0.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,planCredit:-35.0,planCreditPercent:0.05,netCredit:2365.0,annualTPAFee:12000.0,investAvgExpRatio:0.43,investDollarCost:301.0,adviserFeePercent:0.0,adviserFeeDollar:0.0,planCostPct:20.95,planCostDollar:14666.0,dealerCompPct:0.0,dealerCompDollar:0.0,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0}";
	        PriceItResult res6 = gson.fromJson(sR6, PriceItResult.class);
	        
	        List<PriceItResult> list = new ArrayList<PriceItResult>();
	        list.add(res1);
	        list.add(res2);  
	        list.add(res3);
	        list.add(res4);
	        list.add(res5);  
	        list.add(res6);
	        
	        data.put("priceitresultlist", list);
		
		return data;
	}
	
    public static Map<String, Object> getMileStoneData(Map<String, Object> data) {
    	    	
    	Gson gson = new Gson();
    	List<MilestoneResult> r2List = new ArrayList<MilestoneResult>();
    	
    	String r2_1 = "{planAsset:20000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:50000.0,totalPlanAsset:70000.0,numParticipants:2,avgAccountBalance:10000.0,planCredit:-280.0,planCreditPercent:0.4,netCredit:2120.0,annualTPAFee:12000.0,investDollarCost:1043.0,adviserFeeDollar:0.0,planCostDollar:15163.0,planCostPct:21.66,sectionType:current,isRestricted:false,feeBasedCompPct:0.65,feeBasedCompDollar:455.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.66,planCostPercent:100.0}";     	
    	MilestoneResult r2ms_1 = gson.fromJson(r2_1, MilestoneResult.class);
    	
    	String r2_2 = "{planAsset:70000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:100000.0,totalPlanAsset:120000.0,numParticipants:2,avgAccountBalance:35000.0,planCredit:-480.0,planCreditPercent:0.4,netCredit:1920.0,annualTPAFee:12000.0,investDollarCost:1788.0,adviserFeeDollar:0.0,planCostDollar:15708.0,planCostPct:13.09,sectionType:increase,isRestricted:false,feeBasedCompPct:0.65,feeBasedCompDollar:780.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.66,planCostPercent:60.43397968605725}";
    	MilestoneResult r2ms_2 = gson.fromJson(r2_2, MilestoneResult.class);
    	
    	String r2_3 = "{planAsset:120000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:150000.0,totalPlanAsset:170000.0,numParticipants:2,avgAccountBalance:60000.0,planCredit:-680.0,planCreditPercent:0.4,netCredit:1720.0,annualTPAFee:12000.0,investDollarCost:2533.0,adviserFeeDollar:0.0,planCostDollar:16253.0,planCostPct:9.56,sectionType:increase,isRestricted:false,feeBasedCompPct:0.65,feeBasedCompDollar:1105.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.66,planCostPercent:44.13665743305633}";
    	MilestoneResult r2ms_3 = gson.fromJson(r2_3, MilestoneResult.class);
    	
    	String r2_4 = "{planAsset:170000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:200000.0,totalPlanAsset:220000.0,numParticipants:2,avgAccountBalance:85000.0,planCredit:-880.0,planCreditPercent:0.4,netCredit:1520.0,annualTPAFee:12000.0,investDollarCost:3278.0,adviserFeeDollar:0.0,planCostDollar:16798.0,planCostPct:7.64,sectionType:increase,isRestricted:false,feeBasedCompPct:0.65,feeBasedCompDollar:1430.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.66,planCostPercent:35.27239150507849}";
    	MilestoneResult r2ms_4 = gson.fromJson(r2_4, MilestoneResult.class);
    	
    	String r2_5 = "{planAsset:220000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:250000.0,totalPlanAsset:270000.0,numParticipants:2,avgAccountBalance:110000.0,planCredit:-1080.0,planCreditPercent:0.4,netCredit:1320.0,annualTPAFee:12000.0,investDollarCost:4023.0,adviserFeeDollar:0.0,planCostDollar:17343.0,planCostPct:6.42,sectionType:increase,isRestricted:false,feeBasedCompPct:0.65,feeBasedCompDollar:1755.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.66,planCostPercent:29.6398891966759}";
    	MilestoneResult r2ms_5 = gson.fromJson(r2_5, MilestoneResult.class);
    	
    	r2List.add(r2ms_1);
    	r2List.add(r2ms_2);
    	r2List.add(r2ms_3);
    	r2List.add(r2ms_4);
    	r2List.add(r2ms_5);
    	
    	data.put("R2", r2List);
    	
    	List<MilestoneResult> r2EList = new ArrayList<MilestoneResult>();
    	
    	String r2e_1 = "{planAsset:20000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:50000.0,totalPlanAsset:70000.0,numParticipants:2,avgAccountBalance:10000.0,planCredit:-175.0,planCreditPercent:0.25,netCredit:2225.0,annualTPAFee:12000.0,investDollarCost:826.0,adviserFeeDollar:0.0,planCostDollar:15051.0,planCostPct:21.5,sectionType:current,isRestricted:false,feeBasedCompPct:0.5,feeBasedCompDollar:350.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.5,planCostPercent:100.0}";
    	MilestoneResult r2ems_1 = gson.fromJson(r2e_1, MilestoneResult.class);
    	
    	String r2e_2 = "{planAsset:70000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:100000.0,totalPlanAsset:120000.0,numParticipants:2,avgAccountBalance:35000.0,planCredit:-300.0,planCreditPercent:0.25,netCredit:2100.0,annualTPAFee:12000.0,investDollarCost:1416.0,adviserFeeDollar:0.0,planCostDollar:15516.0,planCostPct:12.93,sectionType:increase,isRestricted:false,feeBasedCompPct:0.5,feeBasedCompDollar:600.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.5,planCostPercent:60.13953488372093}";
    	MilestoneResult r2ems_2 = gson.fromJson(r2e_2, MilestoneResult.class);

    	String r2e_3 = "{planAsset:120000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:150000.0,totalPlanAsset:170000.0,numParticipants:2,avgAccountBalance:60000.0,planCredit:-425.0,planCreditPercent:0.25,netCredit:1975.0,annualTPAFee:12000.0,investDollarCost:2006.0,adviserFeeDollar:0.0,planCostDollar:15981.0,planCostPct:9.4,sectionType:increase,isRestricted:false,feeBasedCompPct:0.5,feeBasedCompDollar:850.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.5,planCostPercent:43.72093023255814}";
    	MilestoneResult r2ems_3 = gson.fromJson(r2e_3, MilestoneResult.class);
    	
    	String r2e_4 = "{planAsset:170000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:200000.0,totalPlanAsset:220000.0,numParticipants:2,avgAccountBalance:85000.0,planCredit:-550.0,planCreditPercent:0.25,netCredit:1850.0,annualTPAFee:12000.0,investDollarCost:2596.0,adviserFeeDollar:0.0,planCostDollar:16446.0,planCostPct:7.48,sectionType:increase,isRestricted:false,feeBasedCompPct:0.5,feeBasedCompDollar:1100.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.5,planCostPercent:34.7906976744186}";
    	MilestoneResult r2ems_4 = gson.fromJson(r2e_4, MilestoneResult.class);
    	
    	String r2e_5 = "{planAsset:220000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:250000.0,totalPlanAsset:270000.0,numParticipants:2,avgAccountBalance:110000.0,planCredit:-675.0,planCreditPercent:0.25,netCredit:1725.0,annualTPAFee:12000.0,investDollarCost:3186.0,adviserFeeDollar:0.0,planCostDollar:16911.0,planCostPct:6.26,sectionType:increase,isRestricted:false,feeBasedCompPct:0.5,feeBasedCompDollar:1350.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.5,planCostPercent:29.11627906976744}";
    	MilestoneResult r2ems_5 = gson.fromJson(r2e_5, MilestoneResult.class);
    	
    	r2EList.add(r2ems_1);
    	r2EList.add(r2ems_2);
    	r2EList.add(r2ems_3);
    	r2EList.add(r2ems_4);
    	r2EList.add(r2ems_5);
    	
    	data.put("R2E", r2EList);
    	
    	List<MilestoneResult> r3List = new ArrayList<MilestoneResult>();
    	
    	String r3_1 = "{planAsset:20000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:50000.0,totalPlanAsset:70000.0,numParticipants:2,avgAccountBalance:10000.0,planCredit:-175.0,planCreditPercent:0.25,netCredit:2225.0,annualTPAFee:12000.0,investDollarCost:742.0,adviserFeeDollar:0.0,planCostDollar:14967.0,planCostPct:21.38,sectionType:current,isRestricted:false,feeBasedCompPct:0.35,feeBasedCompDollar:244.99999999999997,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.38,planCostPercent:100.0}";
    	MilestoneResult r3ms_1 = gson.fromJson(r3_1, MilestoneResult.class);
    	
    	String r3_2 = "{planAsset:70000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:100000.0,totalPlanAsset:120000.0,numParticipants:2,avgAccountBalance:35000.0,planCredit:-300.0,planCreditPercent:0.25,netCredit:2100.0,annualTPAFee:12000.0,investDollarCost:1272.0,adviserFeeDollar:0.0,planCostDollar:15372.0,planCostPct:12.81,sectionType:increase,isRestricted:false,feeBasedCompPct:0.35,feeBasedCompDollar:420.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.38,planCostPercent:59.91580916744621}";
    	MilestoneResult r3ms_2 = gson.fromJson(r3_2, MilestoneResult.class);

    	String r3_3 = "{planAsset:120000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:150000.0,totalPlanAsset:170000.0,numParticipants:2,avgAccountBalance:60000.0,planCredit:-425.0,planCreditPercent:0.25,netCredit:1975.0,annualTPAFee:12000.0,investDollarCost:1802.0,adviserFeeDollar:0.0,planCostDollar:15777.0,planCostPct:9.28,sectionType:increase,isRestricted:false,feeBasedCompPct:0.35,feeBasedCompDollar:595.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.38,planCostPercent:43.40505144995323}";
    	MilestoneResult r3ms_3 = gson.fromJson(r3_3, MilestoneResult.class);
    	
    	String r3_4 = "{planAsset:170000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:200000.0,totalPlanAsset:220000.0,numParticipants:2,avgAccountBalance:85000.0,planCredit:-550.0,planCreditPercent:0.25,netCredit:1850.0,annualTPAFee:12000.0,investDollarCost:2332.0,adviserFeeDollar:0.0,planCostDollar:16182.0,planCostPct:7.36,sectionType:increase,isRestricted:false,feeBasedCompPct:0.35,feeBasedCompDollar:770.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.38,planCostPercent:34.42469597754911}";
    	MilestoneResult r3ms_4 = gson.fromJson(r3_4, MilestoneResult.class);
    	
    	String r3_5 = "{planAsset:220000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:250000.0,totalPlanAsset:270000.0,numParticipants:2,avgAccountBalance:110000.0,planCredit:-675.0,planCreditPercent:0.25,netCredit:1725.0,annualTPAFee:12000.0,investDollarCost:2862.0,adviserFeeDollar:0.0,planCostDollar:16587.0,planCostPct:6.14,sectionType:increase,isRestricted:false,feeBasedCompPct:0.35,feeBasedCompDollar:944.9999999999999,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.38,planCostPercent:28.71842843779233}";
    	MilestoneResult r3ms_5 = gson.fromJson(r3_5, MilestoneResult.class);
    	
    	r3List.add(r3ms_1);
    	r3List.add(r3ms_2);
    	r3List.add(r3ms_3);
    	r3List.add(r3ms_4);
    	r3List.add(r3ms_5);
    	
    	data.put("R3", r3List);
    	
    	
    	List<MilestoneResult> r4List = new ArrayList<MilestoneResult>();
    	
    	String r4_1 = "{planAsset:20000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:50000.0,totalPlanAsset:70000.0,numParticipants:2,avgAccountBalance:10000.0,planCredit:-35.0,planCreditPercent:0.05,netCredit:2365.0,annualTPAFee:12000.0,investDollarCost:511.0,adviserFeeDollar:0.0,planCostDollar:14876.0,planCostPct:21.25,sectionType:current,isRestricted:false,feeBasedCompPct:0.25,feeBasedCompDollar:175.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.25,planCostPercent:100.0}";
    	MilestoneResult r4ms_1 = gson.fromJson(r4_1, MilestoneResult.class);
    	
    	String r4_2 = "{planAsset:70000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:100000.0,totalPlanAsset:120000.0,numParticipants:2,avgAccountBalance:35000.0,planCredit:-60.0,planCreditPercent:0.05,netCredit:2340.0,annualTPAFee:12000.0,investDollarCost:876.0,adviserFeeDollar:0.0,planCostDollar:15216.0,planCostPct:12.68,sectionType:increase,isRestricted:false,feeBasedCompPct:0.25,feeBasedCompDollar:300.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.25,planCostPercent:59.67058823529412}";
    	MilestoneResult r4ms_2 = gson.fromJson(r4_2, MilestoneResult.class);

    	String r4_3 = "{planAsset:120000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:150000.0,totalPlanAsset:170000.0,numParticipants:2,avgAccountBalance:60000.0,planCredit:-85.0,planCreditPercent:0.05,netCredit:2315.0,annualTPAFee:12000.0,investDollarCost:1241.0,adviserFeeDollar:0.0,planCostDollar:15556.0,planCostPct:9.15,sectionType:increase,isRestricted:false,feeBasedCompPct:0.25,feeBasedCompDollar:425.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.25,planCostPercent:43.05882352941177}";
    	MilestoneResult r4ms_3 = gson.fromJson(r4_3, MilestoneResult.class);
    	
    	String r4_4 = "{planAsset:170000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:200000.0,totalPlanAsset:220000.0,numParticipants:2,avgAccountBalance:85000.0,planCredit:-110.0,planCreditPercent:0.05,netCredit:2290.0,annualTPAFee:12000.0,investDollarCost:1606.0,adviserFeeDollar:0.0,planCostDollar:15896.0,planCostPct:7.23,sectionType:increase,isRestricted:false,feeBasedCompPct:0.25,feeBasedCompDollar:550.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.25,planCostPercent:34.023529411764706}";
    	MilestoneResult r4ms_4 = gson.fromJson(r4_4, MilestoneResult.class);
    	
    	String r4_5 = "{planAsset:220000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:250000.0,totalPlanAsset:270000.0,numParticipants:2,avgAccountBalance:110000.0,planCredit:-135.0,planCreditPercent:0.05,netCredit:2265.0,annualTPAFee:12000.0,investDollarCost:1971.0,adviserFeeDollar:0.0,planCostDollar:16236.0,planCostPct:6.01,sectionType:increase,isRestricted:false,feeBasedCompPct:0.25,feeBasedCompDollar:675.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:21.25,planCostPercent:28.28235294117647}";
    	MilestoneResult r4ms_5 = gson.fromJson(r4_5, MilestoneResult.class);
    	
    	r4List.add(r4ms_1);
    	r4List.add(r4ms_2);
    	r4List.add(r4ms_3);
    	r4List.add(r4ms_4);
    	r4List.add(r4ms_5);
    	
    	data.put("R4", r4List);
    	
    	List<MilestoneResult> r5EList = new ArrayList<MilestoneResult>();
    	
    	String r5e_1 = "{planAsset:20000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:50000.0,totalPlanAsset:70000.0,numParticipants:2,avgAccountBalance:10000.0,planCredit:-105.0,planCreditPercent:0.15,netCredit:2295.0,annualTPAFee:12000.0,investDollarCost:350.0,adviserFeeDollar:0.0,planCostDollar:14645.0,planCostPct:20.92,sectionType:current,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.92,planCostPercent:99.99999999999999}";
    	MilestoneResult r5ems_1 = gson.fromJson(r5e_1, MilestoneResult.class);
    	
    	String r5e_2 = "{planAsset:70000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:100000.0,totalPlanAsset:120000.0,numParticipants:2,avgAccountBalance:35000.0,planCredit:-180.0,planCreditPercent:0.15,netCredit:2220.0,annualTPAFee:12000.0,investDollarCost:600.0,adviserFeeDollar:0.0,planCostDollar:14820.0,planCostPct:12.35,sectionType:increase,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.92,planCostPercent:59.03441682600382}";
    	MilestoneResult r5ems_2 = gson.fromJson(r5e_2, MilestoneResult.class);

    	String r5e_3 = "{planAsset:120000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:150000.0,totalPlanAsset:170000.0,numParticipants:2,avgAccountBalance:60000.0,planCredit:-255.0,planCreditPercent:0.15,netCredit:2145.0,annualTPAFee:12000.0,investDollarCost:850.0,adviserFeeDollar:0.0,planCostDollar:14995.0,planCostPct:8.82,sectionType:increase,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.92,planCostPercent:42.16061185468451}";
    	MilestoneResult r5ems_3 = gson.fromJson(r5e_3, MilestoneResult.class);
    	
    	String r5e_4 = "{planAsset:170000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:200000.0,totalPlanAsset:220000.0,numParticipants:2,avgAccountBalance:85000.0,planCredit:-330.0,planCreditPercent:0.15,netCredit:2070.0,annualTPAFee:12000.0,investDollarCost:1100.0,adviserFeeDollar:0.0,planCostDollar:15170.0,planCostPct:6.9,sectionType:increase,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.92,planCostPercent:32.98279158699808}";
    	MilestoneResult r5ems_4 = gson.fromJson(r5e_4, MilestoneResult.class);
    	
    	String r5e_5 = "{planAsset:220000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:250000.0,totalPlanAsset:270000.0,numParticipants:2,avgAccountBalance:110000.0,planCredit:-405.0,planCreditPercent:0.15,netCredit:1995.0,annualTPAFee:12000.0,investDollarCost:1350.0,adviserFeeDollar:0.0,planCostDollar:15345.0,planCostPct:5.68,sectionType:increase,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.92,planCostPercent:27.151051625239003}";
    	MilestoneResult r5ems_5 = gson.fromJson(r5e_5, MilestoneResult.class);
    	
    	r5EList.add(r5ems_1);
    	r5EList.add(r5ems_2);
    	r5EList.add(r5ems_3);
    	r5EList.add(r5ems_4);
    	r5EList.add(r5ems_5);
    	
    	data.put("R5E", r5EList);
    	
    	
    	List<MilestoneResult> r5List = new ArrayList<MilestoneResult>();
    	
    	String r5_1 = "{planAsset:20000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:50000.0,totalPlanAsset:70000.0,numParticipants:2,avgAccountBalance:10000.0,planCredit:-35.0,planCreditPercent:0.05,netCredit:2365.0,annualTPAFee:12000.0,investDollarCost:301.0,adviserFeeDollar:0.0,planCostDollar:14666.0,planCostPct:20.95,sectionType:current,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.95,planCostPercent:100.0}";
    	MilestoneResult r5ms_1 = gson.fromJson(r5_1, MilestoneResult.class);
    	
    	String r5_2 = "{planAsset:70000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:100000.0,totalPlanAsset:120000.0,numParticipants:2,avgAccountBalance:35000.0,planCredit:-60.0,planCreditPercent:0.05,netCredit:2340.0,annualTPAFee:12000.0,investDollarCost:516.0,adviserFeeDollar:0.0,planCostDollar:14856.0,planCostPct:12.38,sectionType:increase,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.95,planCostPercent:59.09307875894988}";
    	MilestoneResult r5ms_2 = gson.fromJson(r5_2, MilestoneResult.class);

    	String r5_3 = "{planAsset:120000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:150000.0,totalPlanAsset:170000.0,numParticipants:2,avgAccountBalance:60000.0,planCredit:-85.0,planCreditPercent:0.05,netCredit:2315.0,annualTPAFee:12000.0,investDollarCost:731.0,adviserFeeDollar:0.0,planCostDollar:15046.0,planCostPct:8.85,sectionType:increase,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.95,planCostPercent:42.243436754176614}";
    	MilestoneResult r5ms_3 = gson.fromJson(r5_3, MilestoneResult.class);
    	
    	String r5_4 = "{planAsset:170000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:200000.0,totalPlanAsset:220000.0,numParticipants:2,avgAccountBalance:85000.0,planCredit:-110.0,planCreditPercent:0.05,netCredit:2290.0,annualTPAFee:12000.0,investDollarCost:946.0,adviserFeeDollar:0.0,planCostDollar:15236.0,planCostPct:6.93,sectionType:increase,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.95,planCostPercent:33.07875894988067}";
    	MilestoneResult r5ms_4 = gson.fromJson(r5_4, MilestoneResult.class);
    	
    	String r5_5 = "{planAsset:220000.0,annualFee:2400.0,wilShireService:0.0,wilShireFeePercent:0.0,wilShireFeeDollar:0.0,estimatedAnnContributions:250000.0,totalPlanAsset:270000.0,numParticipants:2,avgAccountBalance:110000.0,planCredit:-135.0,planCreditPercent:0.05,netCredit:2265.0,annualTPAFee:12000.0,investDollarCost:1161.0,adviserFeeDollar:0.0,planCostDollar:15426.0,planCostPct:5.71,sectionType:increase,isRestricted:false,feeBasedCompPct:0.0,feeBasedCompDollar:0.0,creditAmountPct:0.0,creditAmountDollar:0.0,maxPlanCostPct:20.95,planCostPercent:27.255369928400956}";
    	MilestoneResult r5ms_5 = gson.fromJson(r5_5, MilestoneResult.class);
    	
    	r5List.add(r5ms_1);
    	r5List.add(r5ms_2);
    	r5List.add(r5ms_3);
    	r5List.add(r5ms_4);
    	r5List.add(r5ms_5);
    	
    	data.put("R5", r5List);
    	
    	return data;
    }

}
