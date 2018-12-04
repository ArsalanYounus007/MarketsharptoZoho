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


import msharpmodel.Contact;

/**
* Generated by the generator tool for the OData extension for the Restlet framework.<br>
*
* @see <a href="http://localhost:57241/WcfDataService.svc/$metadata">Metadata of the target OData service</a>
*
*/
public class ContactType {

    private String contactId;
    private String contactType;
    private String id;
    private boolean isActive;
    private Contact contact;

    /**
     * Constructor without parameter.
     * 
     */
    public ContactType() {
        super();
    }

    /**
     * Constructor.
     * 
     * @param id
     *            The identifiant value of the entity.
     */
    public ContactType(String id) {
        this();
        this.id = id;
    }

   /**
    * Returns the value of the "contactId" attribute.
    *
    * @return The value of the "contactId" attribute.
    */
   public String getContactId() {
      return contactId;
   }
   /**
    * Returns the value of the "contactType" attribute.
    *
    * @return The value of the "contactType" attribute.
    */
   public String getContactType() {
      return contactType;
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
    * Returns the value of the "contact" attribute.
    *
    * @return The value of the "contact" attribute.
    */
   public Contact getContact() {
      return contact;
   }
   
   /**
    * Sets the value of the "contactId" attribute.
    *
    * @param contactId
    *     The value of the "contactId" attribute.
    */
   public void setContactId(String contactId) {
      this.contactId = contactId;
   }
   /**
    * Sets the value of the "contactType" attribute.
    *
    * @param contactType
    *     The value of the "contactType" attribute.
    */
   public void setContactType(String contactType) {
      this.contactType = contactType;
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
    * Sets the value of the "contact" attribute.
    *
    * @param contact"
    *     The value of the "contact" attribute.
    */
   public void setContact(Contact contact) {
      this.contact = contact;
   }

}