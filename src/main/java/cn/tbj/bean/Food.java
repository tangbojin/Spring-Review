/**
 * FileName: Food
 * Author:   tbj12
 * Date:     2019/5/26 0026 15:49
 * Description:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package cn.tbj.bean;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author tbj12
 * @create 2019/5/26 0026
 * @since 1.0.0
 */
public class Food {
    private int id;
    private String foodName;
    private Double foodPrice;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public Double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", foodName='" + foodName + '\'' +
                ", foodPrice=" + foodPrice +
                '}';
    }
}