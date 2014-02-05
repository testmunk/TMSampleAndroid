Before do |scenario|
  @s_name = scenario.name.gsub! ' ','_'
  @count = 0
end

AfterStep do |scenario|
  if @s_name != nil && @s_name.length > 0
    screenshot_embed({:name => "#{@count}_#{@s_name}"})
    @count += 1
  end
end
