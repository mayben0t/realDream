package third.world.demo.dto;

/**
 * @Author WangXiao
 * @Description TODO
 * @Date 2018/11/8
 **/
public class PageTO {
    private int total;
    private int totalPage;
    private int currentPage;
    private int pageSize;


    public int getTotal() {
        int i=0;
        String s;
        System.out.println("cc");
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
