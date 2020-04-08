package com.cybertek.pages;

import com.cybertek.base.VytrackPageBase;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCalendarEventPage extends VytrackPageBase {
    public CreateCalendarEventPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "oro_calendar_events_from[allDay]")
    public WebElement allDayEventCheckBox;

    @FindBy(css = "input[id^='recurrence-repeat']")
    public WebElement repeatCheckbox;

}

