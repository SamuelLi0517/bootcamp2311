package com.vtxlab.bootcamp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class App1SpyTest {

  //@Mock//105
   @Spy // 109
  private App2 app2;// During the UT, there is an objected created for app2

  @InjectMocks
  private App1 app1;

  @Test
  void testMultiply() {
    // if we just mock provider2(), provider() is still working normally (due to Spy)
    when(app2.provider2(8, 2)).thenReturn(105);
    //App1 app1 = new App1(app2);
    int actual = this.app1.mulitply(8, 2);
    assertEquals(109, actual);// 8/2 + 105
  }

  @Test
  void testnewMethod() {
    // when(app2.provider(8, 2)).thenReturn(100);
    // when(app2.provider2(8, 2)).thenReturn(1000);
    //App1 app1 = new App1(app2);
    int actual = app1.newMethod(8, 2);
    assertEquals(520, actual);//


  }



}
