package test.demo.weatherapp

import okhttp3.internal.Util
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import test.demo.weatherapp.util.getDayOfWeek
import test.demo.weatherapp.util.isToday


class ValidatorTest {

    @Test
    fun isTodayTest() {


        var actual = isToday("2018-09-05")
        var expected = true

        Assert.assertEquals(expected, actual)
    }

    @Test
    fun testDayOfWeek() {
        var dayOfWeek = getDayOfWeek("2018-09-05").toLowerCase()
        Assert.assertEquals("wednesday",dayOfWeek)
        Assert.assertNotNull(dayOfWeek)
//        Assert.assertSame("wednesday",dayOfWeek)

    }
}