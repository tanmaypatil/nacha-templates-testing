<?xml version="1.0" encoding="UTF-8"?>
<S2SCTIcf:SCTIcfBlkCredTrf xsi:schemaLocation="urn:S2SCTIcf:xsd:$SCTIcfBlkCredTrf SCTIcfBlkCredTrf.xsd"
    xmlns:S2SCTIcf="urn:S2SCTIcf:xsd:$SCTIcfBlkCredTrf"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
    <S2SCTIcf:SndgInst>DHEUDHEU</S2SCTIcf:SndgInst>
    <S2SCTIcf:RcvgInst>ZYDOFRP0</S2SCTIcf:RcvgInst>
    <S2SCTIcf:FileRef>236F64737E452E4X</S2SCTIcf:FileRef>
    <S2SCTIcf:SrvcId>SCT</S2SCTIcf:SrvcId>
    <S2SCTIcf:TstCode>P</S2SCTIcf:TstCode>
    <S2SCTIcf:FType>ICF</S2SCTIcf:FType>
    <S2SCTIcf:FDtTm>2023-06-15T06:47:38</S2SCTIcf:FDtTm>
    <S2SCTIcf:NumCTBlk>0</S2SCTIcf:NumCTBlk>
    <S2SCTIcf:NumPCRBlk>0</S2SCTIcf:NumPCRBlk>
    <S2SCTIcf:NumRFRBlk>0</S2SCTIcf:NumRFRBlk>
    <S2SCTIcf:NumROIBlk>1</S2SCTIcf:NumROIBlk>
    <S2SCTIcf:NumSRBlk>0</S2SCTIcf:NumSRBlk>
    <S2SCTIcf:RsltnOfInvstgtn xmlns="urn:iso:std:iso:20022:tech:xsd:camt.029.001.09">
        <Assgnmt>
            <Id>${sepaConfig.bic}</Id>
            <Assgnr>
                <Agt>
                    <FinInstnId>
                        <BICFI>DHEUDHEU</BICFI>
                    </FinInstnId>
                </Agt>
            </Assgnr>
            <Assgne>
                <Agt>
                    <FinInstnId>
                        <BICFI>ZYDOFRP0</BICFI>
                    </FinInstnId>
                </Agt>
            </Assgne>
            <CreDtTm>2023-06-15T06:47:38</CreDtTm>
        </Assgnmt>
        <Sts>
            <Conf>RJCR</Conf>
        </Sts>
        <CxlDtls>
            <TxInfAndSts>
                <CxlStsId>236F646376F52BR3</CxlStsId>
                <OrgnlGrpInf>
                    <OrgnlMsgId>BAAA4645410256488</OrgnlMsgId>
                    <OrgnlMsgNmId>pacs.008.001.08</OrgnlMsgNmId>
                </OrgnlGrpInf>
                <OrgnlInstrId>2020030302001ABAAA7314355943033</OrgnlInstrId>
                <OrgnlEndToEndId>E2EvW2FwX03QFpOFJ1dn</OrgnlEndToEndId>
                <OrgnlTxId>BAAA2358199107806</OrgnlTxId>
                <TxCxlSts>RJCR</TxCxlSts>
                <CxlStsRsnInf>
                    <Orgtr>
                        <Id>
                            <OrgId>
                                <AnyBIC>DHEUDHEU</AnyBIC>
                            </OrgId>
                        </Id>
                    </Orgtr>
                    <Rsn>
                        <Cd>CUST</Cd>
                    </Rsn>
                    <AddtlInf>ATR053/-BAAA4454035830122</AddtlInf>
                </CxlStsRsnInf>
                <OrgnlTxRef>
                    <IntrBkSttlmAmt Ccy="EUR">10</IntrBkSttlmAmt>
                    <IntrBkSttlmDt>2023-11-19</IntrBkSttlmDt>
                    <SttlmInf>
                        <SttlmMtd>CLRG</SttlmMtd>
                        <ClrSys>
                            <Prtry>ST2</Prtry>
                        </ClrSys>
                    </SttlmInf>
                    <PmtTpInf>
                        <SvcLvl>
                            <Cd>SEPA</Cd>
                        </SvcLvl>
                    </PmtTpInf>
                    <UltmtDbtr>
                        <Pty>
                            <Id>
                                <OrgId>
                                    <LEI>AAAAAAAAAAAAAAAAAA10</LEI>
                                </OrgId>
                            </Id>
                        </Pty>
                    </UltmtDbtr>
                    <Dbtr>
                        <Pty>
                            <Nm>IVnV SmoketestDE1 comp bypass  BI_INQ_RES NO_BI_WAIT</Nm>
                            <PstlAdr>
                                <Dept>Department</Dept>
                                <SubDept>Sub Department</SubDept>
                                <StrtNm>Street Name</StrtNm>
                                <BldgNb>Building Number</BldgNb>
                                <BldgNm>Building Name</BldgNm>
                                <Flr>Floor</Flr>
                                <PstBx>Post Box</PstBx>
                                <Room>Room</Room>
                                <PstCd>Post Code</PstCd>
                                <TwnNm>Town Name</TwnNm>
                                <TwnLctnNm>Town Location Name</TwnLctnNm>
                                <DstrctNm>District Name</DstrctNm>
                                <CtrySubDvsn>Country Sub Division</CtrySubDvsn>
                                <Ctry>DE</Ctry>
                                <AdrLine>101 SDD Five Days Future File St</AdrLine>
                            </PstlAdr>
                            <Id>
                                <OrgId>
                                    <AnyBIC>COBADEFFXXX</AnyBIC>
                                </OrgId>
                            </Id>
                        </Pty>
                    </Dbtr>
                    <DbtrAcct>
                        <Id>
                            <IBAN>FR7641219160100000601015854</IBAN>
                        </Id>
                    </DbtrAcct>
                    <DbtrAgt>
                        <FinInstnId>
                            <BICFI>CITIEUXXXXX</BICFI>
                        </FinInstnId>
                    </DbtrAgt>
                    <CdtrAgt>
                        <FinInstnId>
                            <BICFI>DHEUDHEUXXX</BICFI>
                        </FinInstnId>
                    </CdtrAgt>
                    <Cdtr>
                        <Pty>
                            <Nm>BOFA Cdtr</Nm>
                            <PstlAdr>
                                <Dept>Department</Dept>
                                <SubDept>Sub Department</SubDept>
                                <StrtNm>Street Name</StrtNm>
                                <BldgNb>Building Number</BldgNb>
                                <BldgNm>Building Name</BldgNm>
                                <Flr>Floor</Flr>
                                <PstBx>Post Box</PstBx>
                                <Room>Room</Room>
                                <PstCd>Post Code</PstCd>
                                <TwnNm>Town Name</TwnNm>
                                <TwnLctnNm>Town Location Name</TwnLctnNm>
                                <DstrctNm>District Name</DstrctNm>
                                <CtrySubDvsn>Country Sub Division</CtrySubDvsn>
                                <Ctry>DE</Ctry>
                                <AdrLine>101 SDD Five Days Future File St</AdrLine>
                            </PstlAdr>
                            <Id>
                                <OrgId>
                                    <LEI>AAAAAAAAAAAAAAAAAA10</LEI>
                                </OrgId>
                            </Id>
                        </Pty>
                    </Cdtr>
                    <CdtrAcct>
                        <Id>
                            <IBAN>DE09500109000033332097</IBAN>
                        </Id>
                    </CdtrAcct>
                    <UltmtCdtr>
                        <Pty>
                            <Nm>TEST</Nm>
                            <Id>
                                <OrgId>
                                    <AnyBIC>COBADEFFXXX</AnyBIC>
                                </OrgId>
                            </Id>
                        </Pty>
                    </UltmtCdtr>
                </OrgnlTxRef>
            </TxInfAndSts>
        </CxlDtls>
    </S2SCTIcf:RsltnOfInvstgtn>
</S2SCTIcf:SCTIcfBlkCredTrf>