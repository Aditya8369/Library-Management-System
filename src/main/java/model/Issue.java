package model;

import java.sql.Date;

public class Issue {
    private int bookId;
    private int memberId;
    private Date issueDate;
    public Issue(int bookId,int memberId,Date issueDate){
        this.bookId = bookId;
        this.memberId = memberId;
        this.issueDate = issueDate;
    }
    public int getBookId(){
        return bookId;
    }
    public int getMemberId(){
        return memberId;
    }
    public Date getIssueDate(){
        return issueDate;
    }

}
