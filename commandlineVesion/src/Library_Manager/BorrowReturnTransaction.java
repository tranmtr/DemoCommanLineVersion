package Library_Manager;

import java.util.Date;

public class BorrowReturnTransaction {
    private String transactionId;
    private String userId;
    private String documentId;
    private boolean isBorrow;
    private boolean isReturn;
    private Date borrowDate;
    private Date returnDate;

    /**
     * Constructor 1 muon chua tra.
     * @param transactionId ma giao dich
     * @param userId ma nguoi dung
     * @param documentId ma tai lieu
     * @param isBorrow da muon hay chua
     * @param isReturn da tra hay chua
     * @param borrowDate ngay muon
     */
    public BorrowReturnTransaction(String transactionId, String userId, String documentId, boolean isBorrow, boolean isReturn, Date borrowDate) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.documentId = documentId;
        this.isBorrow = isBorrow;
        this.isReturn = isReturn;
        this.borrowDate = borrowDate;
    }

    /**
     * Constructor 2 muon da tra.
     * @param transactionId ma giao dich
     * @param userId ma khach hang
     * @param documentId ma tai lieu
     * @param isBorrow da muon
     * @param isReturn da tra
     * @param borrowDate ngay muon
     * @param returnDate ngay tra
     */
    public BorrowReturnTransaction(String transactionId, String userId, String documentId, boolean isBorrow, boolean isReturn, Date borrowDate, Date returnDate) {
        this.transactionId = transactionId;
        this.userId = userId;
        this.documentId = documentId;
        this.isBorrow = isBorrow;
        this.isReturn = isReturn;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public boolean getBorrow() {
        return isBorrow;
    }

    public void setBorrow(boolean borrow) {
        isBorrow = borrow;
    }

    public boolean getReturn() {
        return isReturn;
    }

    public void setReturn(boolean aReturn) {
        isReturn = aReturn;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void completeTransaction() {
        System.out.println("Transaction ID: " + transactionId);
        System.out.println("User ID: " + userId);
        System.out.println("Document ID: " + documentId);
        System.out.println("Date borrow: " + borrowDate);
        if (!isReturn) {
            System.out.println("Books have not been returned");
        } else {
            System.out.println("Date return: " + returnDate);
        }
        System.out.println("Complete the transaction");
    }
}
