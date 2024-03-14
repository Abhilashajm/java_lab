package issuebook;
import student.Student;
import requestbook.RequestBook;

public class IssueBook {
    private RequestBook rb;

    public IssueBook(RequestBook rb) {
        this.rb = rb;
    }

    public void issubook() {
        System.out.println("issuing the book");
        System.out.println("with request id as " + this.rb.getrequestID() + " being issued to " + this.rb.getStudent().getname());
        System.out.println("book is to be delivered to: " + this.rb.getStudent().getregisterNo());
    }
}