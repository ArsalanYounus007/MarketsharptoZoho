/**
 * Copyright 2005-2010 Noelios Technologies.
 * 
 * The contents of this file are subject to the terms of one of the following
 * open source licenses: LGPL 3.0 or LGPL 2.1 or CDDL 1.0 or EPL 1.0 (the
 * "Licenses"). You can select the license that you prefer but you may not use
 * this file except in compliance with one of these Licenses.
 * 
 * You can obtain a copy of the LGPL 3.0 license at
 * http://www.opensource.org/licenses/lgpl-3.0.html
 * 
 * You can obtain a copy of the LGPL 2.1 license at
 * http://www.opensource.org/licenses/lgpl-2.1.php
 * 
 * You can obtain a copy of the CDDL 1.0 license at
 * http://www.opensource.org/licenses/cddl1.php
 * 
 * You can obtain a copy of the EPL 1.0 license at
 * http://www.opensource.org/licenses/eclipse-1.0.php
 * 
 * See the Licenses for the specific language governing permissions and
 * limitations under the Licenses.
 * 
 * Alternatively, you can obtain a royalty free commercial license with less
 * limitations, transferable or non-transferable, directly at
 * http://www.noelios.com/products/restlet-engine
 * 
 * Restlet is a registered trademark of Noelios Technologies.
 */

package msharpmodel;


import java.util.Date;
import java.util.List;
import msharpmodel.Job;
import msharpmodel.Loan;
import msharpmodel.PaymentHistory;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://localhost:57241/WcfDataService.svc/$metadata">Metadata of the target OData service</a>
*
*/
public class Contract {

    private double balanceDue;
    private double cashTotal;
    private Date completedDate;
    private Date contractDate;
    private double financeTotal;
    private double gross;
    private double grossPercent;
    private String id;
    private boolean isActive;
    private String jobId;
    private String paymentType;
    private String status;
    private double totalContract;
    private Job job;
    private List<Loan> loan;
    private List<PaymentHistory> paymentHistory;

    /**
     * Constructor without parameter.
     * 
     */
    public Contract() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public Contract(String id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "balanceDue" attribute.
    *
    * @return The value of the "balanceDue" attribute.
    */
   public double getBalanceDue() {
      return balanceDue;
   }
   /**
    * Returns the value of the "cashTotal" attribute.
    *
    * @return The value of the "cashTotal" attribute.
    */
   public double getCashTotal() {
      return cashTotal;
   }
   /**
    * Returns the value of the "completedDate" attribute.
    *
    * @return The value of the "completedDate" attribute.
    */
   public Date getCompletedDate() {
      return completedDate;
   }
   /**
    * Returns the value of the "contractDate" attribute.
    *
    * @return The value of the "contractDate" attribute.
    */
   public Date getContractDate() {
      return contractDate;
   }
   /**
    * Returns the value of the "financeTotal" attribute.
    *
    * @return The value of the "financeTotal" attribute.
    */
   public double getFinanceTotal() {
      return financeTotal;
   }
   /**
    * Returns the value of the "gross" attribute.
    *
    * @return The value of the "gross" attribute.
    */
   public double getGross() {
      return gross;
   }
   /**
    * Returns the value of the "grossPercent" attribute.
    *
    * @return The value of the "grossPercent" attribute.
    */
   public double getGrossPercent() {
      return grossPercent;
   }
   /**
    * Returns the value of the "id" attribute.
    *
    * @return The value of the "id" attribute.
    */
   public String getId() {
      return id;
   }
   /**
    * Returns the value of the "isActive" attribute.
    *
    * @return The value of the "isActive" attribute.
    */
   public boolean getIsActive() {
      return isActive;
   }
   /**
    * Returns the value of the "jobId" attribute.
    *
    * @return The value of the "jobId" attribute.
    */
   public String getJobId() {
      return jobId;
   }
   /**
    * Returns the value of the "paymentType" attribute.
    *
    * @return The value of the "paymentType" attribute.
    */
   public String getPaymentType() {
      return paymentType;
   }
   /**
    * Returns the value of the "status" attribute.
    *
    * @return The value of the "status" attribute.
    */
   public String getStatus() {
      return status;
   }
   /**
    * Returns the value of the "totalContract" attribute.
    *
    * @return The value of the "totalContract" attribute.
    */
   public double getTotalContract() {
      return totalContract;
   }
   /**
    * Returns the value of the "job" attribute.
    *
    * @return The value of the "job" attribute.
    */
   public Job getJob() {
      return job;
   }
   
   /**
    * Returns the value of the "loan" attribute.
    *
    * @return The value of the "loan" attribute.
    */
   public List<Loan> getLoan() {
      return loan;
   }
   
   /**
    * Returns the value of the "paymentHistory" attribute.
    *
    * @return The value of the "paymentHistory" attribute.
    */
   public List<PaymentHistory> getPaymentHistory() {
      return paymentHistory;
   }
   
   /**
    * Sets the value of the "balanceDue" attribute.
    *
    * @param balanceDue
    *     The value of the "balanceDue" attribute.
    */
   public void setBalanceDue(double balanceDue) {
      this.balanceDue = balanceDue;
   }
   /**
    * Sets the value of the "cashTotal" attribute.
    *
    * @param cashTotal
    *     The value of the "cashTotal" attribute.
    */
   public void setCashTotal(double cashTotal) {
      this.cashTotal = cashTotal;
   }
   /**
    * Sets the value of the "completedDate" attribute.
    *
    * @param completedDate
    *     The value of the "completedDate" attribute.
    */
   public void setCompletedDate(Date completedDate) {
      this.completedDate = completedDate;
   }
   /**
    * Sets the value of the "contractDate" attribute.
    *
    * @param contractDate
    *     The value of the "contractDate" attribute.
    */
   public void setContractDate(Date contractDate) {
      this.contractDate = contractDate;
   }
   /**
    * Sets the value of the "financeTotal" attribute.
    *
    * @param financeTotal
    *     The value of the "financeTotal" attribute.
    */
   public void setFinanceTotal(double financeTotal) {
      this.financeTotal = financeTotal;
   }
   /**
    * Sets the value of the "gross" attribute.
    *
    * @param gross
    *     The value of the "gross" attribute.
    */
   public void setGross(double gross) {
      this.gross = gross;
   }
   /**
    * Sets the value of the "grossPercent" attribute.
    *
    * @param grossPercent
    *     The value of the "grossPercent" attribute.
    */
   public void setGrossPercent(double grossPercent) {
      this.grossPercent = grossPercent;
   }
   /**
    * Sets the value of the "id" attribute.
    *
    * @param id
    *     The value of the "id" attribute.
    */
   public void setId(String id) {
      this.id = id;
   }
   /**
    * Sets the value of the "isActive" attribute.
    *
    * @param isActive
    *     The value of the "isActive" attribute.
    */
   public void setIsActive(boolean isActive) {
      this.isActive = isActive;
   }
   /**
    * Sets the value of the "jobId" attribute.
    *
    * @param jobId
    *     The value of the "jobId" attribute.
    */
   public void setJobId(String jobId) {
      this.jobId = jobId;
   }
   /**
    * Sets the value of the "paymentType" attribute.
    *
    * @param paymentType
    *     The value of the "paymentType" attribute.
    */
   public void setPaymentType(String paymentType) {
      this.paymentType = paymentType;
   }
   /**
    * Sets the value of the "status" attribute.
    *
    * @param status
    *     The value of the "status" attribute.
    */
   public void setStatus(String status) {
      this.status = status;
   }
   /**
    * Sets the value of the "totalContract" attribute.
    *
    * @param totalContract
    *     The value of the "totalContract" attribute.
    */
   public void setTotalContract(double totalContract) {
      this.totalContract = totalContract;
   }
   /**
    * Sets the value of the "job" attribute.
    *
    * @param job"
    *     The value of the "job" attribute.
    */
   public void setJob(Job job) {
      this.job = job;
   }

   /**
    * Sets the value of the "loan" attribute.
    *
    * @param loan"
    *     The value of the "loan" attribute.
    */
   public void setLoan(List<Loan> loan) {
      this.loan = loan;
   }

   /**
    * Sets the value of the "paymentHistory" attribute.
    *
    * @param paymentHistory"
    *     The value of the "paymentHistory" attribute.
    */
   public void setPaymentHistory(List<PaymentHistory> paymentHistory) {
      this.paymentHistory = paymentHistory;
   }

}