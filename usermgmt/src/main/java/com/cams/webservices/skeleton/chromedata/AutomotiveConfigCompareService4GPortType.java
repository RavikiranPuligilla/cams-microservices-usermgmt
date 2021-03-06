
package com.cams.webservices.skeleton.chromedata;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.3-b02-
 * Generated source version: 2.1
 * 
 */
@WebService(name = "AutomotiveConfigCompareService4gPortType", targetNamespace = "urn:configcompare4g.kp.chrome.com")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AutomotiveConfigCompareService4GPortType {


    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.DataVersionArrayElement
     */
    @WebMethod
    @WebResult(name = "DataVersionArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public DataVersionArrayElement getDataVersions(
        @WebParam(name = "DataVersionsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        DataVersionsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.IntArrayElement
     */
    @WebMethod
    @WebResult(name = "IntArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public IntArrayElement getModelYears(
        @WebParam(name = "ModelYearsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ModelYearsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.DivisionArrayElement
     */
    @WebMethod
    @WebResult(name = "DivisionArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public DivisionArrayElement getDivisions(
        @WebParam(name = "DivisionsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        DivisionsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.SubdivisionArrayElement
     */
    @WebMethod
    @WebResult(name = "SubdivisionArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public SubdivisionArrayElement getSubdivisions(
        @WebParam(name = "SubdivisionsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SubdivisionsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelArrayElement
     */
    @WebMethod
    @WebResult(name = "ModelArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelArrayElement getModelsByDivision(
        @WebParam(name = "ModelsByDivisionRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ModelsByDivisionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelArrayElement
     */
    @WebMethod
    @WebResult(name = "ModelArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelArrayElement getModelsBySubdivision(
        @WebParam(name = "ModelsBySubdivisionRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ModelsBySubdivisionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.StringArrayElement
     */
    @WebMethod
    @WebResult(name = "StringArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public StringArrayElement getConsumerFriendlyModelNamesByDivision(
        @WebParam(name = "ConsumerModelNamesByDivisionRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ConsumerModelNamesByDivisionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.StringArrayElement
     */
    @WebMethod
    @WebResult(name = "StringArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public StringArrayElement getConsumerFriendlyModelNamesBySubdivision(
        @WebParam(name = "ConsumerModelNamesBySubdivisionRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ConsumerModelNamesBySubdivisionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.StyleArrayElement
     */
    @WebMethod
    @WebResult(name = "StyleArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public StyleArrayElement getStyles(
        @WebParam(name = "StylesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        StylesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.StyleArrayElement
     */
    @WebMethod
    @WebResult(name = "StyleArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public StyleArrayElement getStylesByConsumerFriendlyModelNameAndDivision(
        @WebParam(name = "StylesByConsumerModelNameAndDivisionRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        StylesByConsumerModelNameAndDivisionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.StyleArrayElement
     */
    @WebMethod
    @WebResult(name = "StyleArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public StyleArrayElement getStylesByConsumerFriendlyModelNameAndSubdivision(
        @WebParam(name = "StylesByConsumerModelNameAndSubdivisionRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        StylesByConsumerModelNameAndSubdivisionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.StringArrayElement
     */
    @WebMethod
    @WebResult(name = "StringArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public StringArrayElement getOrderableOptionCodes(
        @WebParam(name = "OrderableOptionCodesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        OrderableOptionCodesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.SelectedOrderableOptionCodesResponse
     */
    @WebMethod
    @WebResult(name = "SelectedOrderableOptionCodesResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public SelectedOrderableOptionCodesResponse getSelectedOrderableOptionCodes(
        @WebParam(name = "SelectedOrderableOptionCodesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SelectedOrderableOptionCodesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConfigurationStateElement
     */
    @WebMethod
    @WebResult(name = "ConfigurationStateElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConfigurationStateElement materializeConfigurationState(
        @WebParam(name = "ConfigurationStateRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ConfigurationStateRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigurationStateElement
     */
    @WebMethod
    @WebResult(name = "ModelConfigurationStateElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigurationStateElement materializeModelConfigurationState(
        @WebParam(name = "ModelConfigurationStateRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ModelConfigurationStateRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConfigurationElement getConfiguration(
        @WebParam(name = "ConfigurationRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ConfigurationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConfigurationElement getConfigurationByStyleId(
        @WebParam(name = "ConfigurationByStyleIdRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ConfigurationByStyleIdRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConfigurationElement getConstrainedConfigurationByStyleId(
        @WebParam(name = "ConstrainedConfigurationByStyleIdRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ConstrainedConfigurationByStyleIdRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ToggleOptionResponse
     */
    @WebMethod
    @WebResult(name = "ToggleOptionResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ToggleOptionResponse getStyleFullyConfigured(
        @WebParam(name = "FullyConfiguredRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        FullyConfiguredRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ToggleOptionResponse
     */
    @WebMethod
    @WebResult(name = "ToggleOptionResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ToggleOptionResponse getStyleFullyConfiguredByStyleId(
        @WebParam(name = "FullyConfiguredByStyleIdRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        FullyConfiguredByStyleIdRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ModelConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigurationElement getModelConfiguration(
        @WebParam(name = "ModelConfigurationRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ModelConfigurationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ModelConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigurationElement getModelConfigurationByStyles(
        @WebParam(name = "ModelConfigurationByStylesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ModelConfigurationByStylesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ModelConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigurationElement getModelConfigurationByStyleIds(
        @WebParam(name = "ModelConfigurationByStyleIdsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ModelConfigurationByStyleIdsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ModelConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigurationElement addCustomEquipmentToModelConfiguration(
        @WebParam(name = "ModelConfigurationWithCustomEquipmentRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ModelConfigurationWithCustomEquipmentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConfigurationElement addCustomEquipmentToConfiguration(
        @WebParam(name = "ConfigurationWithCustomEquipmentRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ConfigurationWithCustomEquipmentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ModelConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigurationElement clearCustomEquipmentFromModelConfiguration(
        @WebParam(name = "ClearModelConfigurationCustomEquipmentRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ClearModelConfigurationCustomEquipmentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConfigurationElement clearCustomEquipmentFromConfiguration(
        @WebParam(name = "ClearConfigurationCustomEquipmentRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ClearConfigurationCustomEquipmentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ModelConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigurationElement removeCustomEquipmentFromModelConfiguration(
        @WebParam(name = "RemoveModelConfigurationCustomEquipmentRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        RemoveModelConfigurationCustomEquipmentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConfigurationElement removeCustomEquipmentFromConfiguration(
        @WebParam(name = "RemoveConfigurationCustomEquipmentRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        RemoveConfigurationCustomEquipmentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ToggleOptionResponse
     */
    @WebMethod
    @WebResult(name = "ToggleOptionResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ToggleOptionResponse setConditionProperties(
        @WebParam(name = "SetConditionPropertiesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SetConditionPropertiesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConditionPropertyArrayElement
     */
    @WebMethod
    @WebResult(name = "ConditionPropertyArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConditionPropertyArrayElement getConditionProperties(
        @WebParam(name = "GetConditionPropertiesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        GetConditionPropertiesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ToggleModelEquipmentResponse
     */
    @WebMethod
    @WebResult(name = "ToggleModelEquipmentResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ToggleModelEquipmentResponse setModelConditionProperties(
        @WebParam(name = "SetModelConditionPropertiesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SetModelConditionPropertiesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConditionPropertyArrayElement
     */
    @WebMethod
    @WebResult(name = "ConditionPropertyArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConditionPropertyArrayElement getModelConditionProperties(
        @WebParam(name = "GetModelConditionPropertiesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        GetModelConditionPropertiesRequest request);

    /**
     * 
     * @param result
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConfigurationElement setUserDefinedTechSpecs(
        @WebParam(name = "SetUserDefinedTechSpecsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
        SetUserDefinedTechSpecsRequest result);

    /**
     * 
     * @param result
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ModelConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigurationElement setModelUserDefinedTechSpecs(
        @WebParam(name = "SetModelUserDefinedTechSpecsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
        SetModelUserDefinedTechSpecsRequest result);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ToggleOptionResponse
     */
    @WebMethod
    @WebResult(name = "ToggleOptionResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ToggleOptionResponse toggleOption(
        @WebParam(name = "ToggleOptionRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ToggleOptionRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.SelectMultipleOptionsResponse
     */
    @WebMethod
    @WebResult(name = "SelectMultipleOptionsResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public SelectMultipleOptionsResponse selectMultipleOptions(
        @WebParam(name = "SelectMultipleOptionsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SelectMultipleOptionsRequest request);

    /**
     * 
     * @param result
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ConfigurationStateArrayElement
     */
    @WebMethod
    @WebResult(name = "ConfigurationStateArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ConfigurationStateArrayElement autoEquipStyles(
        @WebParam(name = "AutoEquipRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
        AutoEquipRequest result);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ToggleModelEquipmentResponse
     */
    @WebMethod
    @WebResult(name = "ToggleModelEquipmentResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ToggleModelEquipmentResponse toggleModelEquipment(
        @WebParam(name = "ToggleModelEquipmentRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ToggleModelEquipmentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.SelectMultipleModelEquipmentResponse
     */
    @WebMethod
    @WebResult(name = "SelectMultipleModelEquipmentResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public SelectMultipleModelEquipmentResponse selectMultipleModelEquipment(
        @WebParam(name = "SelectMultipleModelEquipmentRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SelectMultipleModelEquipmentRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigurationElement
     */
    @WebMethod
    @WebResult(name = "ModelConfigurationElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigurationElement reduceModelConfiguration(
        @WebParam(name = "ReduceModelConfigurationRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ReduceModelConfigurationRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.StringArrayElement
     */
    @WebMethod
    @WebResult(name = "StringArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public StringArrayElement getAdvantageComparisonRuleSetNames(
        @WebParam(name = "AdvantageComparisonRuleSetNamesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        AdvantageComparisonRuleSetNamesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.AdvantageBasedComparison
     */
    @WebMethod
    @WebResult(name = "AdvantageBasedComparison", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public AdvantageBasedComparison compareAdvantages(
        @WebParam(name = "AdvantageBasedComparisonRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        AdvantageBasedComparisonRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.SideBySideComparison
     */
    @WebMethod
    @WebResult(name = "SideBySideComparison", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public SideBySideComparison compareSideBySide(
        @WebParam(name = "SideBySideComparisonRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SideBySideComparisonRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelConfigSideBySideComparison
     */
    @WebMethod
    @WebResult(name = "ModelConfigSideBySideComparison", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public ModelConfigSideBySideComparison compareStylesOfModelConfiguration(
        @WebParam(name = "ModelConfigSideBySideComparisonRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ModelConfigSideBySideComparisonRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.SearchCriterionDescriptorArrayElement
     */
    @WebMethod
    @WebResult(name = "SearchCriterionDescriptorArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "response")
    public SearchCriterionDescriptorArrayElement getSearchCriterionDescriptors(
        @WebParam(name = "SearchCriterionDescriptorRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SearchCriterionDescriptorRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.StyleArrayElement
     */
    @WebMethod
    @WebResult(name = "StyleArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
    public StyleArrayElement searchStyles(
        @WebParam(name = "SearchStylesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SearchStylesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.ModelSearchResultArrayElement
     */
    @WebMethod
    @WebResult(name = "ModelSearchResultArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
    public ModelSearchResultArrayElement searchModels(
        @WebParam(name = "SearchModelsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        SearchModelsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.SearchCriterionErrorArrayElement
     */
    @WebMethod
    @WebResult(name = "SearchCriterionErrorArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public SearchCriterionErrorArrayElement validateSearch(
        @WebParam(name = "ValidateSearchRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        ValidateSearchRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.OptionKindArrayElement
     */
    @WebMethod
    @WebResult(name = "OptionKindArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public OptionKindArrayElement getOptionKinds(
        @WebParam(name = "OptionKindsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        OptionKindsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.MarketClassArrayElement
     */
    @WebMethod
    @WebResult(name = "MarketClassArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public MarketClassArrayElement getMarketClasses(
        @WebParam(name = "MarketClassesRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        MarketClassesRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.CategoryDefinitionsArrayElement
     */
    @WebMethod
    @WebResult(name = "CategoryDefinitionsArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public CategoryDefinitionsArrayElement getCategoryDefinitions(
        @WebParam(name = "CategoryDefinitionsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        CategoryDefinitionsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.TechnicalSpecificationDefinitionArrayElement
     */
    @WebMethod
    @WebResult(name = "TechnicalSpecificationDefinitionArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public TechnicalSpecificationDefinitionArrayElement getTechnicalSpecificationDefinitions(
        @WebParam(name = "TechnicalSpecificationDefinitionsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        TechnicalSpecificationDefinitionsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.NaipcCountryOptionArrayElement
     */
    @WebMethod
    @WebResult(name = "NaipcCountryOptionArrayElement", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public NaipcCountryOptionArrayElement getNaipcCountryOptions(
        @WebParam(name = "NaipcCountryOptionsRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        NaipcCountryOptionsRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.MetaGroupDefListType
     */
    @WebMethod
    @WebResult(name = "MetaGroupDefListType", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public MetaGroupDefListType getGroups(
        @WebParam(name = "MetaGroupsDefRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        MetaGroupsDefRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.FootnoteListType
     */
    @WebMethod
    @WebResult(name = "FootnoteListType", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public FootnoteListType getFootnotes(
        @WebParam(name = "FootnoteRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        FootnoteRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.TemplateBasedCompareResponse
     */
    @WebMethod
    @WebResult(name = "TemplateBasedCompareResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public TemplateBasedCompareResponse doTemplateBasedCompare(
        @WebParam(name = "TemplateBasedCompareRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        TemplateBasedCompareRequest request);

    /**
     * 
     * @param request
     * @return
     *     returns com.cams.webservices.skeleton.chromedata.FeaturesMatrixChartResponse
     */
    @WebMethod
    @WebResult(name = "FeaturesMatrixChartResponse", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "result")
    public FeaturesMatrixChartResponse getFeaturesMatrixChart(
        @WebParam(name = "FeaturesMatrixChartRequest", targetNamespace = "urn:configcompare4g.kp.chrome.com", partName = "request")
        FeaturesMatrixChartRequest request);

}
