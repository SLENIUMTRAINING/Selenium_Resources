

List<WebElement> list = driver.findElements(By.tagname("a"));
System.out.println(list.size());

for(int i=0; i<list.size(); i++){
  system.out.println(list.get(i).getText());
  
  if(list.get(i).getText().equals("Learn")){
    list.get(i).click();
    break;
    }
}
