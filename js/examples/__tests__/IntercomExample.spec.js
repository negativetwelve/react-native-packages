// Libraries
import 'react-native';
import React from 'react';
import Renderer from 'react-test-renderer';

// Components
import IntercomExample from '../IntercomExample';


it('renders correctly', () => {
  const tree = Renderer.create(
    <IntercomExample />
  );
});
