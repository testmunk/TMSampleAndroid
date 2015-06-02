require 'calabash-android/calabash_steps'

Then(/^"(.*?)" radio button should be selected$/) do |arg1|
  if(!query("RadioButton text:'#{arg1}'", :checked).first())
  	fail("The radio button with text #{arg1} should be selected")
  end
end

Then(/^I select "(.*?)" radio button$/) do |arg1|
  touch("RadioButton text:'#{arg1}'")
end

Then(/^"(.*?)" radio button should not be selected$/) do |arg1|
  if(query("RadioButton text:'#{arg1}'", :checked).first())
  	fail("The radio button with text #{arg1} should not be selected")
  end
end
