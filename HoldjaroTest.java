import org.junit.Assert;
import org.junit.Test;

public class HoldjaroTest {

    @Test
    public void TurnTest(){
        Assert.assertEquals('W', Holdjaro.Turn('l'));
    }

    @Test
    public void MoveTest(){
        Assert.assertEquals("N23", Holdjaro.Move('f'));
    }

    @Test
    public void CollisionTest(){
        Assert.assertEquals("N33", Holdjaro.Move('b'));
    }
}

