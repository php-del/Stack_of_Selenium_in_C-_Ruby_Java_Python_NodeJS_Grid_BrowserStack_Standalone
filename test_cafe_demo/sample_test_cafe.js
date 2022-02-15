// Save this file as test.js

import { Selector } from 'testcafe';

fixture('TestCafe example page').page(
  'http://localhost:8888/Complete_assignment_web_page.html'
);

test("Should submit developer's name successfully", async user => {
  // To interact with a DOM element, we must use the Selector function
  const interfaceSelect = Selector("input[value='Male']");

  await user
    .click(interfaceSelect);

});
